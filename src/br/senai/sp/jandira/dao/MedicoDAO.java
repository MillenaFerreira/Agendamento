package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private final static String URL = "C:\\Users\\22282227\\java\\Medico\\Medico.txt";
    private final static Path PATH = Paths.get(URL);

    private final static String URL_TEMP = "C:\\Users\\22282227\\java\\Medico\\Medico-temp.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medico = new ArrayList<>();

    public static void gravar(Medico m) {
        medico.add(m);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(
                    null,
                    "OCORREU UM ERRO!!");
        }
    }

    public static ArrayList<Medico> getMedico() {
        return medico;
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medico) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medicoAtualizado) {
        for (Medico m : medico) {
            if (m.getCodigo() == medicoAtualizado.getCodigo()) {
                medico.set(medico.indexOf(m), medicoAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) {
        for (Medico m : medico) {
            if (m.getCodigo().equals(codigo)) {
                medico.remove(m);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void atualizarArquivo() {
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medico) {
                bwTemp.write(m.getMedicoSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void criarListaDeMedico() {

        try {

            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                String[] vetor = linha.split(";");

                String[] data = vetor[5].split("-");
                
                
                Medico m = new Medico(
                        Integer.valueOf(vetor[0]), //codigo
                        vetor[1], //nome
                        vetor[2], //telefone
                        vetor[3], //email
                        vetor[4], //crm
                        LocalDate.of(
                                Integer.parseInt(data[0]),
                                Integer.parseInt(data[1]),
                                Integer.parseInt(data[2])));

                medico.add(m);

                linha = leitor.readLine();

            }

            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
            e.printStackTrace();
        }

//        Medico m1 = new Medico("Maria", "(11)95948-5912", "mariadr@gmail.com", "12121212-0/BR");
//        Medico m2 = new Medico("José", "(11)95555-5555", "josédr@gmail.com", "11121662-9/BR");
//        Medico m3 = new Medico("Mauricio", "(11)93578-5212", "mauriciodr@gmail.com", "18151292-5/BR");
//        Medico m4 = new Medico("Miguel", "(11)95948-5912", "migueldr@gmail.com", "32125672-4/BR");
//        
//      medico.add(m1);
//      medico.add(m2);
//      medico.add(m3);
//      medico.add(m4);
//    
        System.out.println(medico.size());
    }

    public static DefaultTableModel getTabelaMedico() {
        System.out.println("montando" + medico.size());

        String[] titulo = {
            "CÓDIDO",
            "NOME DO MÉDICO",
            "TELEFONE",
            "CRM"
        };
        String[][] dados = new String[medico.size()][4];

        for (Medico m : medico) {

            int i = medico.indexOf(m);

            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getTelefone();
            dados[i][3] = m.getCrm();

        }
        return new DefaultTableModel(dados, titulo);
    }

    
    
    
    
    
}
