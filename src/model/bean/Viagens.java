package model.bean;

public class Viagens {
   private int idViagem;
   private int idVeic;
   private String motivo;
   private int kmInicial;
   private String dataViagem;
   private int kmFinal;
   private String cep;
   private String rua;
   private int numero;
   private String bairro;
   private String cidade;
   private String uf;
   private String horaInicio;
   private String horaDestino;
   private String horaRetorno;
   private String horaFinal;
   private String dataDestino;
   private String dataRetorno;
   private String dataFinal;

    public Viagens() {
    }

    public Viagens(int idViagem, int idVeic, String motivo, int kmInicial, String dataViagem, int kmFinal, String cep, String rua, int numero, String bairro, String cidade, String uf, String horaInicio, String horaDestino, String horaRetorno, String horaFinal, String dataDestino, String dataRetorno, String dataFinal) {
        this.idViagem = idViagem;
        this.idVeic = idVeic;
        this.motivo = motivo;
        this.kmInicial = kmInicial;
        this.dataViagem = dataViagem;
        this.kmFinal = kmFinal;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.horaInicio = horaInicio;
        this.horaDestino = horaDestino;
        this.horaRetorno = horaRetorno;
        this.horaFinal = horaFinal;
        this.dataDestino = dataDestino;
        this.dataRetorno = dataRetorno;
        this.dataFinal = dataFinal;
    }

    public String getDataDestino() {
        return dataDestino;
    }

    public void setDataDestino(String dataDestino) {
        this.dataDestino = dataDestino;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    
    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    public int getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(int idVeic) {
        this.idVeic = idVeic;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public String getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(String dataViagem) {
        this.dataViagem = dataViagem;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraDestino() {
        return horaDestino;
    }

    public void setHoraDestino(String horaDestino) {
        this.horaDestino = horaDestino;
    }

    public String getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(String horaRetorno) {
        this.horaRetorno = horaRetorno;
    }
    
}

