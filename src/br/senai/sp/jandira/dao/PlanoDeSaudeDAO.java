
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    
    public static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude p){
        planoDeSaude.add(p);
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
    }    
        
        //instancia de um objeto
    public static void excluir(String numeroDaCarteira){ //DELETE
        for (PlanoDeSaude p : planoDeSaude){
            if(p.getNumeroDaCarteira().equals(numeroDaCarteira)){
                planoDeSaude.remove(p);
                break;
            }
        }
    }
        
    

    public static void criarListaDePlanoDeSaude(){
        PlanoDeSaude p1 = new PlanoDeSaude("11.11111111.11", "Amil", "Bronze", LocalDate.of(2020, 1, 1));
        PlanoDeSaude p2 = new PlanoDeSaude("22.11111111.11", "Bradesco", "Bronze", LocalDate.of(2020, 1, 1));
        PlanoDeSaude p3 = new PlanoDeSaude("33.11111111.11", "Amil", "Prata", LocalDate.of(2020, 1, 1));
        PlanoDeSaude p4 = new PlanoDeSaude("44.11111111.11", "Inter", "Ouro", LocalDate.of(2020, 1, 1));
        
        
        planoDeSaude.add(p1);
        planoDeSaude.add(p2);
        planoDeSaude.add(p3);
        planoDeSaude.add(p4);
            
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
            dados[i][2] = p.getValidade().toString();
            dados[i][3] = p.getCategoria();

            i++;
        }
        return new DefaultTableModel(dados, titulo);
    }
         
        
}
    
    
    
    
    


