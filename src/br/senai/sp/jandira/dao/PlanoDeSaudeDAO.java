
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    /*
    Essa classe será responsável pela persistência de dados do Plano de saúde, 
    por exemplo, adicionar um novo Plano de Saúde, excluir um Plano de Saúde, 
    etc.
    */
    
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
            if(p.getNumeroDaCarteira() == numeroDaCarteira){
                planoDeSaude.remove(p);
                break;
            }
        }
    }
        
    

    public static void criarListaDePlanoDeSaude(){
        PlanoDeSaude p1 = new PlanoDeSaude("11.11111111.11");
        PlanoDeSaude p2 = new PlanoDeSaude("22.22222222.22");
        PlanoDeSaude p3 = new PlanoDeSaude("33.11111111.33");
        PlanoDeSaude p4 = new PlanoDeSaude("33.11111111.44");
        
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
          "Validade"
        
        };
        String[][] dados = new String[planoDeSaude.size()][3];
        
        //faltando o for e o restante do projeto todo
    }
        
        
        
        
        
        
        
        
}
    
    
    
    
    


