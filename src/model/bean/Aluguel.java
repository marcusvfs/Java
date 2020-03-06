
package model.bean;

/**
 *
 * @author Emersin
 */
public class Aluguel {
    private int idAlug;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String chassi;
    private String cor;
    private int km;
    private String tipo;
    private String veicAlugado;
    private int pesquisa;

    public Aluguel() {
    }

    public Aluguel(int idAlug, String marca, String modelo, int ano, String placa, String chassi, String cor, int km, String tipo, String veicAlugado) {
        this.idAlug = idAlug;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.km = km;
        this.tipo = tipo;
        this.veicAlugado = veicAlugado;
    }

    public int getIdAlug() {
        return idAlug;
    }

    public void setIdAlug(int idAlug) {
        this.idAlug = idAlug;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setchassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVeicAlugado() {
        return veicAlugado;
    }

    public void setVeicAlugado(String veicAlugado) {
        this.veicAlugado = veicAlugado;
    }

    public int getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(int pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    
}
