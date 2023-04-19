package br.ufmt.araguaia.ccomp.projeto;

public class Endereco {

    private String logradouro;
    private int numero;
    private String bairro;
    private int CEP;

    public Endereco(String logradouro, int numero, String bairro, int CEP) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }
}
