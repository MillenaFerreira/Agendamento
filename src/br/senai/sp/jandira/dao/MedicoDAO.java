package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    private static ArrayList<Medico> medico = new ArrayList<>();
    
    public static void gravar(Medico m){
        medico.add(m);
    }
    
    public static ArrayList<Medico> getMedico(){
        return medico;
    }
    
    public static Medico getMedico(Integer codigo){
        for (Medico m : medico){
            if(m.getCodigo() == codigo){
                return m;
            }
        }
        
        return null;
    }
    
    public static void atualizar (Medico medicoAtualizado){
        for(Medico m : medico){
            if(m.getCodigo() == medicoAtualizado.getCodigo()){
                medico.set(medico.indexOf(m), medicoAtualizado);
                break;
            }
        }
    }
    
    public static void excluir(Integer codigo){
        for (Medico m : medico){
            if(m.getCodigo() == codigo){
                medico.remove(m);
                break;
            }
        }
    }
    
    
    public static void criarListaDeMedico(){
        Medico m1 = new Medico("Maria", "(11)95948-5912", "mariadr@gmail.com", "12121212-0/BR");
        Medico m2 = new Medico("José", "(11)95555-5555", "josédr@gmail.com", "11121662-9/BR");
        Medico m3 = new Medico("Mauricio", "(11)93578-5212", "mauriciodr@gmail.com", "18151292-5/BR");
        Medico m4 = new Medico("Miguel", "(11)95948-5912", "migueldr@gmail.com", "32125672-4/BR");
        
    medico.add(m1);
    medico.add(m2);
    medico.add(m3);
    medico.add(m4);
    
        System.out.println(medico.size());
    }
    
    
    public static DefaultTableModel getTabelaMedico(){
        System.out.println("montando" + medico.size());
        
        String[] titulo = {
            "CÓDIDO",
            "NOME DO MÉDICO",
            "TELEFONE",
            "CRM"
        };
        String[][] dados = new String[medico.size()][4];
        
        for(Medico m : medico){
            
            int i = medico.indexOf(m);
            
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getTelefone();
            dados[i][3] = m.getCrm();
            
        }
        return new DefaultTableModel(dados, titulo);
    }
    
}