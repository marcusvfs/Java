package model.bean;

/**
 *
 * @author total
 */
public class Abastecimento {
   private int idAbastecimento;
   private int idVeic;
   private String nomePosto;
   private String cupomFiscal;
   private int km;
   private float valorTotal;
   private String combustivel;
   private int litros;
   private String dataAbastecimento;
   private String cnpj;

    public Abastecimento() {
    }

    public Abastecimento(int idAbastecimento,String cupomFiscal, int idVeic, String nomePosto, int km, float valorTotal, String combustivel, int litros, String dataAbastecimento, String cnpj) {
        this.idAbastecimento = idAbastecimento;
        this.idVeic = idVeic;
        this.nomePosto = nomePosto;
        this.cupomFiscal = cupomFiscal;
        this.km = km;
        this.valorTotal = valorTotal;
        this.combustivel = combustivel;
        this.litros = litros;
        this.dataAbastecimento = dataAbastecimento;
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getIdAbastecimento() {
        return idAbastecimento;
    }

    public void setIdAbastecimento(int idAbastecimento) {
        this.idAbastecimento = idAbastecimento;
    }

    public int getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(int idVeic) {
        this.idVeic = idVeic;
    }

    public String getNomePosto() {
        return nomePosto;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public String getDataAbastecimento() {
        return dataAbastecimento;
    }

    public void setDataAbastecimento(String dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
    }

    public String getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(String cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }
   
}
