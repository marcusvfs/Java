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
public class Veiculo {

    
    private int id_veic;
    private String chassi;
    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private String veicAlugado;
    private int idAlug;
    private int ano;
    private int km;
    private String tipo;
    private int idCli;

    public Veiculo() {
    }

    public Veiculo(int id_veic, String chassi, String placa, String modelo, String tipo ,String marca, String cor, String veicAlugado, int idAlug, int ano, int km, int idCli) {
        this.id_veic = id_veic;
        this.chassi = chassi;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.veicAlugado = veicAlugado;
        this.idAlug = idAlug;
        this.ano = ano;
        this.km = km;
        this.tipo = tipo;
        this.idCli = idCli;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_veic() {
        return id_veic;
    }

    public void setId_veic(int id_veic) {
        this.id_veic = id_veic;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVeicAlugado() {
        return veicAlugado;
    }

    public void setVeicAlugado(String veicAlugado) {
        this.veicAlugado = veicAlugado;
    }

    public int getIdAlug() {
        return idAlug;
    }

    public void setIdAlug(int idAlug) {
        this.idAlug = idAlug;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }
    
}
