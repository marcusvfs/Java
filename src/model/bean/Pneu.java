package model.bean;

/**
 *
 * @author total
 */
public class Pneu {
    private int idPneu;
    private int idVeic;
    private int dtProduzido;
    private String largura;
    private String altura;
    private String aro;
    private float profundidade;
    private String nSerie;
    private int kmPneu;

    public Pneu() {
    }

    public Pneu(int idPneu,int idVeic, int dtProduzido, String largura, String altura, String aro, float profundidade, String nSerie, int kmPneu) {
        this.idPneu = idPneu;
        this.idVeic = idVeic;
        this.dtProduzido = dtProduzido;
        this.largura = largura;
        this.altura = altura;
        this.aro = aro;
        this.profundidade = profundidade;
        this.nSerie = nSerie;
        this.kmPneu = kmPneu;
    }

    public int getKmPneu() {
        return kmPneu;
    }

    public void setKmPneu(int kmPneu) {
        this.kmPneu = kmPneu;
    }

    public int getIdPneu() {
        return idPneu;
    }

    public void setIdPneu(int idPneu) {
        this.idPneu = idPneu;
    }

    public int getDtProduzido() {
        return dtProduzido;
    }

    public void setDtProduzido(int dtProduzido) {
        this.dtProduzido = dtProduzido;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getAro() {
        return aro;
    }

    public void setAro(String aro) {
        this.aro = aro;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public int getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(int idVeic) {
        this.idVeic = idVeic;
    }
       
}