package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
				
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardilogia");
		especialidade.setDescricao("Cardiologia é a especialidade médica que se ocupa do diagnóstico e tratamento das doenças"
				+ " \nque acometem o coração bem como os outros componentes do sistema circulatório.");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("é o médico especializado no diagnóstico e tratamento, clínico e cirúrgico, das doenças dos \nouvidos, nariz, "
				+ "garganta, laringe e pescoço.");
		
		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		System.out.println(especialidade.getNome());
		System.out.println(especialidade.getDescricao());
		System.out.println("");
		System.out.println(especialidade2.getNome());
		System.out.println(especialidade2.getDescricao());
	}

}
