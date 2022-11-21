package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    //atributos
    private static int contador = 999;
    private Integer codigo;
    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;

    //esqueci de colocar data de nascimento
    //construtor
    public Medico(String nome, String telefone, String email, String crm) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        gerarCodigo();
    }
    
    public Medico(){
        
    }

    //metodos
    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecialidade(Especialidade[] especialidade) {
        this.especialidades = especialidade;
    }

    public Especialidade[] getEspecialidade() {
        return especialidades;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    
    public String getMedicoSeparadaPorPontoEVirgula(){
        return this.codigo +";"+this.nome+";"+this.telefone+";"+this.email+";"+this.crm+";"+this.dataDeNascimento+";"+this.especialidades;
    }

    public void getDataDeNascimento(LocalDate parse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
