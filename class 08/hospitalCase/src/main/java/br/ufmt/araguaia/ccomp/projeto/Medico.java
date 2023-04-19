package br.ufmt.araguaia.ccomp.projeto;

import java.util.Date;

public class Medico extends Pessoa {

    private int CRM;
    private Especialidade[] especialidades;
    private double valorHora;

    public Medico(String nome, Date dataNascimento, Endereco endereco, int CRM, Especialidade[] especialidades, double valorHora) {

        super(nome, dataNascimento, endereco);
        this.CRM = CRM;
        this.especialidades = especialidades;
        this.valorHora = valorHora;
    }

    public int getCRM() {
        return CRM;
    }
    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void cadastrarMedico(Medico medico){
    }
    public void alterarMedico(Medico medico){
    }
    public void excluirMedico(Medico medico){
    }
    public Medico consultarMedico(int CRM){
        return null;
    }
   public Medico[] consultarMedicos (String nome){
        return null;
    }

}