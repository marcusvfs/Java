
package model.bean;

/**
 *
 * @author total
 */
public class Multa {
    private int idMulta;
    private int idVeic;
    private String dataOcorrencia;
    private String potuacao;
    private String gravidade;
    private String infracao;
    private String cep;
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private float valor;
    private String dataNotificacao;
    private String dataVencimento;
    private String obervacao;
    private String situacao;

    public Multa() {
    }

    public Multa(int idMulta, int idVeic, String dataOcorrencia, String potuacao, String gravidade, String infracao, String cep, String uf, String cidade, String bairro, String rua, int numero, float valor, String dataNotificacao, String dataVencimento, String obervacao, String situacao) {
        this.idMulta = idMulta;
        this.idVeic = idVeic;
        this.dataOcorrencia = dataOcorrencia;
        this.potuacao = potuacao;
        this.gravidade = gravidade;
        this.infracao = infracao;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.valor = valor;
        this.dataNotificacao = dataNotificacao;
        this.dataVencimento = dataVencimento;
        this.obervacao = obervacao;
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public int getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(int idVeic) {
        this.idVeic = idVeic;
    }

    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getPotuacao() {
        return potuacao;
    }

    public void setPotuacao(String potuacao) {
        this.potuacao = potuacao;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getInfracao() {
        return infracao;
    }

    public void setInfracao(String infracao) {
        this.infracao = infracao;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(String dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getObervacao() {
        return obervacao;
    }

    public void setObervacao(String obervacao) {
        this.obervacao = obervacao;
    }
    
}