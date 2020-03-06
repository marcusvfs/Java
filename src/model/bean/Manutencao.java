package model.bean;

/**
 *
 * @author total
 */
public class Manutencao {
    private int idManutencao;
    private int idVeic;
    private float valorTotal;
    private int km;
    private String estabelecimento;
    private String telefone;
    private String dataManutencao;
    private String motivo;
    private String descricao;

    public Manutencao() {
    }

    public Manutencao(int idManutencao, int idVeic, float valorTotal, int km, String estabelecimento, String telefone, String dataManutencao, String motivo, String descricao) {
        this.idManutencao = idManutencao;
        this.idVeic = idVeic;
        this.valorTotal = valorTotal;
        this.km = km;
        this.estabelecimento = estabelecimento;
        this.telefone = telefone;
        this.dataManutencao = dataManutencao;
        this.motivo = motivo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public int getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(int idVeic) {
        this.idVeic = idVeic;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}