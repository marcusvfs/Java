/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author total
 */
public class Seguro {
    private int idSeguro;
    private int idVeic;
    private String seguradora;
    private String apolice;
    private String corretor;
    private float valorTotal;
    private float valorParcela;
    private String vencimento;
    private String foneCorretor;
    private String celular;
    private String foneCorretor2;
    private String descSinistro;

    public Seguro() {
    }

    public Seguro(int idSeguro, int idVeic, String seguradora, String apolice, String corretor, float valorTotal, float valorParcela, String vencimento, String foneCorretor, String celular, String foneCorretor2, String descSinistro) {
        this.idSeguro = idSeguro;
        this.idVeic = idVeic;
        this.seguradora = seguradora;
        this.apolice = apolice;
        this.corretor = corretor;
        this.valorTotal = valorTotal;
        this.valorParcela = valorParcela;
        this.vencimento = vencimento;
        this.foneCorretor = foneCorretor;
        this.celular = celular;
        this.foneCorretor2 = foneCorretor2;
        this.descSinistro = descSinistro;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public int getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(int idVeic) {
        this.idVeic = idVeic;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public String getCorretor() {
        return corretor;
    }

    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getFoneCorretor() {
        return foneCorretor;
    }

    public void setFoneCorretor(String foneCorretor) {
        this.foneCorretor = foneCorretor;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFoneCorretor2() {
        return foneCorretor2;
    }

    public void setFoneCorretor2(String foneCorretor2) {
        this.foneCorretor2 = foneCorretor2;
    }

    public String getDescSinistro() {
        return descSinistro;
    }

    public void setDescSinistro(String descSinistro) {
        this.descSinistro = descSinistro;
    }
    
}