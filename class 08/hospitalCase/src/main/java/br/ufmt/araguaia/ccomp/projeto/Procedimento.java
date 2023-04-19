package br.ufmt.araguaia.ccomp.projeto;

import java.util.Date;

public abstract class Procedimento {

   private Paciente paciente;
   private Medico[] medicos;
   private Date data;
   private Sala sala;
   private double valor;
   private int tempoDuracao;

    public Procedimento(Paciente paciente, Medico[] medicos, Date data, Sala sala, double valor, int tempoDuracao) {
        this.paciente = paciente;
        this.medicos = medicos;
        this.data = data;
        this.sala = sala;
        this.valor = valor;
        this.tempoDuracao = tempoDuracao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
    
    public void marcarProcedimento(Medico[] medicos, Paciente paciente, Date data){
    }
    public void cancelarProcedimento(Procedimento procedimento){
    }
    public Procedimento[] pesquisarPorMedico(Medico medico){
        return null;
    }
    public abstract double calcularTotal();

    
}
