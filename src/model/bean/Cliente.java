/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Emersin
 */
public class Cliente {
    private int idCli;
    private String empresa;
    private String cnpj;
    private String cnpjR;
    private String cidade;
    private String cep;
    private String uf;
    private String rua;
    private int numero;
    private String bairro;
    private String razaoSocial;
    private String telefone1;
    private String telefone2;
    private String responsavel;
    private String usuario;
    private String senha;

    public Cliente() {
    }

    public Cliente(int idCli, String empresa, String cnpj, String cidade, String cep, String uf, String rua, int numero, String bairro, String razaoSocial, String telefone1, String telefone2, String responsavel, String usuario, String senha) {
        this.idCli = idCli;
        this.empresa = empresa;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.razaoSocial = razaoSocial;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.responsavel = responsavel;
        this.usuario = usuario;
        this.senha = senha;
    }

   
    
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String nome) {
        this.empresa = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String nomeFantasia) {
        this.razaoSocial = nomeFantasia;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
