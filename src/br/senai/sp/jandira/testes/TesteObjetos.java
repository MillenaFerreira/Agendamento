package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        Especialidade e1 = new Especialidade();
        e1.setNome("Cardiologia");
        e1.setDescricao("coração bomba");

        Especialidade e2 = new Especialidade();
        e2.setNome("Gastroenterologia");
        e2.setDescricao("dor de barriga");

//	JOptionPane.showMessageDialog(null, e1.getNome());
        Especialidade e3 = new Especialidade();
//	e3 = e1;
        e3.setNome("qualquer coisa!");

//	JOptionPane.showMessageDialog(null, e1.getNome());
        Especialidade e4 = new Especialidade("Otorrino", "cuida do ouvido");
        Especialidade e5 = new Especialidade("Pediatria", "cuida das crianças");

        
        //exibir a quantidade de especialidade criadas até agora
        System.out.println("    AQUI    ");
        System.out.println("TOTAL DE ESPECIALIDADES------" + e1.getContador());
        
        System.out.println(e1.getCodigo() + "-" + e1.getNome());
        System.out.println(e2.getCodigo() + "-" + e2.getNome());
        System.out.println(e3.getCodigo() + "-" + e3.getNome());
        System.out.println(e4.getCodigo() + "-" + e4.getNome());
        System.out.println(e5.getCodigo() + "-" + e5.getNome());
        
        
        ArrayList<Especialidade> especialidade = new ArrayList<>();
        especialidade.add(e1);
        especialidade.add(e2);
        especialidade.add(e3);
        especialidade.add(e4);

        System.out.println(especialidade.size()); //tamanho que está a ArrayList

        //imprimir no console o nome das especialidades
        //que estão armazenada no arraylist
        int i = 0; //contador
        while (i < especialidade.size()) {
            System.out.println(especialidade.get(i).getNome());
            i++;
        }

        //utilização do for para iteração(repetir) no arraylist
        System.out.println("********FOR*********");
        //    contador;      condição,      acumulador
        for (int x = 0; x < especialidade.size(); x++) {
            System.out.println(especialidade.get(x).getNome());
        }

        //FOR EACH -> para cada
        // : ↞ é um separador 
        // a cada volta é guardado um valor no e da Especialidade,pegando a referência nova e substutuindo o antigo valor.
        System.out.println("********FOR EASH*********");
        for (Especialidade e : especialidade) {
            System.out.println(e.getNome());
        }

        //Criar 3 planos de saude, armazenar em um arraylist
        // e exibir o nome da operadora de cada um deles
        //usando for each
        PlanoDeSaude p1 = new PlanoDeSaude("Amil");
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco");
        PlanoDeSaude p3 = new PlanoDeSaude("Notredame");

        ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);

        System.out.println("*******Plano de Saúde**********");
        for (PlanoDeSaude p : planosDeSaude) {
            System.out.println(p.getOperadora());
            System.out.println(p.getQuantidade());
        }

        PlanoDeSaude xpto1 = new PlanoDeSaude();
        PlanoDeSaude xpto2 = new PlanoDeSaude();
        PlanoDeSaude xpto3 = new PlanoDeSaude();

        System.out.println("-----" + PlanoDeSaude.getQuantidade());
//		System.out.println("-----" + p1.getQuantidade());

        AgendaApp.main(args);

        System.out.println("-----" + PlanoDeSaude.getQuantidade());

    }

}
