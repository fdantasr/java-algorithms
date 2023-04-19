package br.ufmt.araguaia.ccomp.projeto;

import java.util.Date;

public class Paciente extends Pessoa {

    private String CPF;
    private Plano plano;

    public Paciente(String nome, Date dataNascimento, Endereco endereco, String CPF, Plano plano) {
        super(nome, dataNascimento, endereco);

        this.CPF = CPF;
        this.plano = plano;
        
    }

    //crie todas as implementações necessárias para a classe Paciente
    public String getCPF() {
        return CPF;
    }   
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Plano getPlano() {
        return plano;
    }
    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    
    public void cadastrarPaciente(Paciente paciente){
    }
    public void alterarPaciente(Paciente paciente){
    }
    public void excluirPaciente(Paciente paciente){
    }
    public Paciente consultarPaciente(String CPF){
        return null;
    }
    public Paciente[] consultarPacientes(String nome, Date dataNascimento){
        return null;
    }
}
