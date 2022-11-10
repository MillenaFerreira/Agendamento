package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    /*
    Essa classe será responsável pela persistência de dados
    das especialidades, por exemplo, adicionar uma nova especialidade,
    excluir uma especialidade, etc.
    */
    private final static String URL = 
            "C:\\Users\\22282227\\java\\Especialidade\\Especialidade.txt"; 
    private final static Path PATH = Paths.get(URL);
    
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static void gravar(Especialidade e){ //CREATE
        especialidades.add(e);
        
        //** GRAVAR EM ARQUIVO **
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getEspecialidadeSepadaradaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(
                    null, 
                    "OCORREU UM ERRO!!");
        }
    }
    
    public static ArrayList<Especialidade> getEspecialidades(){ //READ
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo){ //READ
        for (Especialidade e : especialidades){
            if(e.getCodigo() == codigo){
                return e;
            }
        }
        
        return null;
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada){ //UPDATE
        for (Especialidade e : especialidades){
            if(e.getCodigo() == especialidadeAtualizada.getCodigo()){
//               e = especialidadeAtualizada;
                //especialidades.remove(e);
                //especialidades.add(especialidadeAtualizada);
               especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
        
        
    }
    
    
    
    
    //instancia de um objeto
    public static void excluir(Integer codigo){ //DELETE
        for (Especialidade e : especialidades){
            if(e.getCodigo() == codigo){
                especialidades.remove(e);
                break;
            }
        }
    }
    
    //criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades(){
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(
                        vetor[1], 
                        vetor[2], 
                        Integer.valueOf(vetor[0]));
                
                //Guardar a especialidade na lista
                especialidades.add(e);
                
                //ler a próxima linha
                linha = leitor.readLine();
                
                
            }
            
            leitor.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao ler o arquivo");
        }
        
//        Especialidade e1 = new Especialidade("Cardiologia", "cuida do coração");
//        Especialidade e2 = new Especialidade("Fisioterapia", "cuida do dodoi");
//        Especialidade e3 = new Especialidade("Clínico geral", "cuida de tudo um pouquinho");
//        Especialidade e4 = new Especialidade("Pediatria", "cuida das crianças");
//        
//        especialidades.add(e1);
//        especialidades.add(e2);
//        especialidades.add(e3);
//        especialidades.add(e4);
    
        System.out.println(especialidades.size());
}
    
   public static DefaultTableModel getTabelaEspecialidades(){
       
       System.out.println("montando " + especialidades.size());
       
       String[] titulo = {
           "CÓDIGO",
           "NOME DA ESPECIALIDADE",
           "DESCRIÇÃO"
       };
       String[][] dados = new String[especialidades.size()][3];
       
       
       for(Especialidade e : especialidades){
           
           int i = especialidades.indexOf(e);
           
           dados[i][0] = e.getCodigo().toString();
           dados[i][1] = e.getNome();
           dados[i][2] = e.getDescricao();
           
       }
       
       return new DefaultTableModel(dados, titulo);
       
   } 
    
    
    
    
    
    
}
