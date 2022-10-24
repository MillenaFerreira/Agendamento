package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

    //atributos
    private String operadora;
    private String categoria;
    private String numeroDaCarteira;
    private LocalDate validade;
//	private static int quantidade; //1 porque cada objeto tem sua própria quantidade
//	private int quantidade; //3 

    //construtor
    public PlanoDeSaude(String numeroDaCarteira, String operadora, String categoria, LocalDate validade) {
        this.numeroDaCarteira = numeroDaCarteira;
        this.categoria = categoria;
        this.operadora = operadora;
        this.validade = validade;
    }

    public PlanoDeSaude() {

    }

    //metodos
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumeroDaCarteira(String numero) {
        this.numeroDaCarteira = numero;
    }

    public String getNumeroDaCarteira() {
        return numeroDaCarteira;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    //não é necessario o set porque ele vai usar o Plano de saude
    //public int getQuantidade()
//	public static int getQuantidade() {
//		return quantidade;
//	}
}
