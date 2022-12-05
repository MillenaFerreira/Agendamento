
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282227\\java\\PlanoDeSaude\\PlanoDeSaude.txt";
    private final static Path PATH = Paths.get(URL);
    
    private final static String URL_TEM = "C:\\Users\\22282227\\java\\PlanoDeSaude\\PlanoDeSaude-temp.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEM);
    
    
//    private final static String URL = "C:\\Users\\Millena\\Pictures\\Medico\\planoDeSaude.txt";
//    private final static Path PATH = Paths.get(URL);
//    
//    private final static String URL_TEM = "C:\\Users\\Millena\\Pictures\\Medico\\planoDeSaude-temp.txt";
//    private final static Path PATH_TEMP = Paths.get(URL_TEM);
    
    public static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    private static CharSequence validade;
    
    public static void gravar(PlanoDeSaude p){
        planoDeSaude.add(p);
        
        // **GRAVAR EM ARQUIVO**
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(p.getPlanoDeSaudeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(
                    null, 
                    "OCORREU UM ERRO!!");
        }
    }
    
    public static ArrayList<PlanoDeSaude> getPlanoDeSaude(){ //READ
        return planoDeSaude;
    }
    public static PlanoDeSaude getPlanoDeSaude (String numeroDaCarteira){
        for (PlanoDeSaude p : planoDeSaude){
            if(p.getNumeroDaCarteira() == numeroDaCarteira){
                return p;
            }
        }
        return null;
    }
    public static void atualizar (PlanoDeSaude planoDeSaudeAtualizado){
        for (PlanoDeSaude p : planoDeSaude){
            if(p.getNumeroDaCarteira() == planoDeSaudeAtualizado.getNumeroDaCarteira()){
                planoDeSaude.set(planoDeSaude.indexOf(p), planoDeSaudeAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }    
        
        //instancia de um objeto
    public static void excluir(String numeroDaCarteira){ //DELETE
        for (PlanoDeSaude p : planoDeSaude){
            if(p.getNumeroDaCarteira().equals(numeroDaCarteira)){
                planoDeSaude.remove(p);
                break;
            }
        }
        atualizarArquivo();
    }
        
    public static void atualizarArquivo(){
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEM);
        
        try {
            arquivoTemp.createNewFile();
            
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(PlanoDeSaude p : planoDeSaude){
                bwTemp.write(p.getPlanoDeSaudeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            
            arquivoAtual.delete();
            
            arquivoTemp.renameTo(arquivoAtual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void criarListaDePlanoDeSaude(){
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                String[] vetor = linha.split(";");
                
                String[] data = vetor[3].split("-");
                        
                PlanoDeSaude p = new PlanoDeSaude(
                        vetor[0], //numero
                        vetor[2], //Operadora
                        vetor[1], //categoria
                        LocalDate.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]))); //validade
                
                planoDeSaude.add(p);
                
                linha = leitor.readLine(); 
            }
            
            leitor.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao ler o arquivo");
            e.printStackTrace();
        }
        
//        PlanoDeSaude p1 = new PlanoDeSaude("11.11111111.11", "Amil", "Bronze", LocalDate.of(2020, 1, 1));
//        PlanoDeSaude p2 = new PlanoDeSaude("22.11111111.11", "Bradesco", "Bronze", LocalDate.of(2020, 1, 1));
//        PlanoDeSaude p3 = new PlanoDeSaude("33.11111111.11", "Amil", "Prata", LocalDate.of(2020, 1, 1));
//        PlanoDeSaude p4 = new PlanoDeSaude("44.11111111.11", "Inter", "Ouro", LocalDate.of(2020, 1, 1));
//        
//        
//        planoDeSaude.add(p1);
//        planoDeSaude.add(p2);
//        planoDeSaude.add(p3);
//        planoDeSaude.add(p4);
            
            System.out.println(planoDeSaude.size());
            
    }
        
    public static DefaultTableModel getTabelaPlanoDeSaude(){
        
        System.out.println("montando" + planoDeSaude.size());
        
        String[] titulo = {
          "Número",
          "Operadora",
          "Validade",
          "Categoria"
        
        };
        String[][] dados = new String[planoDeSaude.size()][4];
        
        for(PlanoDeSaude p : planoDeSaude){
            
            int i = planoDeSaude.indexOf(p);
            
            dados[i][0] = p.getNumeroDaCarteira();
            dados[i][1] = p.getOperadora();
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][2] = p.getValidade().format(barra);
            dados[i][3] = p.getCategoria();

            i++;
        }
        return new DefaultTableModel(dados, titulo);
    }
         
        
}
    
    
    
    
    


