package model.dao;

import connection.TesteBanco;
import java.sql.CallableStatement;
import model.bean.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author emerson.santos
 */
public class VeiculoDAO {

    private Connection con = null;

    public VeiculoDAO() throws ClassNotFoundException {
        con = TesteBanco.getConnection();
    }

    public void inserir(Veiculo veiculo) {
        //String sql = "INSERT INTO Veiculos (chassi, placa, modelo, marca, cor, tipo, ano, veicAlugado, idAlug, km, idCli) SELECT  (?,?,?,?,?,?,?,?,?,?,?) FROM Cliente c WHERE cnpj = (?)";
        PreparedStatement stmt = null;
        CallableStatement calstat = null;

        try {
            calstat = con.prepareCall("{call inserirVeiculo(?,?,?,?,?,?,?,?,?,?,?)}");
            calstat.setString(1, veiculo.getMarca());
            calstat.setString(2, veiculo.getModelo());
            calstat.setInt(3, veiculo.getAno());
            calstat.setString(4, veiculo.getPlaca());
            calstat.setString(5, veiculo.getChassi());
            calstat.setString(6, veiculo.getCor());
            calstat.setInt(7, veiculo.getKm());
            calstat.setString(8, veiculo.getVeicAlugado());
            calstat.setString(9, veiculo.getTipo());
            calstat.setInt(10, veiculo.getIdCli());
            calstat.setInt(11, veiculo.getIdAlug());

            //ResultSet rs = calstat.executeQuery();
            calstat.executeUpdate();
            calstat.close();
            JOptionPane.showMessageDialog(null, "Dados do veículo inseridos com sucesso!");
            con.close();
            System.err.println("Inserido com sucessi!");
        } catch (SQLException ex) {
            System.err.println("Erroa aqui 1: " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }

    public List<Veiculo> Buscar() {
        String sql = "SELECT * FROM veiculos";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculo> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setId_veic(rs.getInt("idVeic"));
                v.setMarca(rs.getString("marca"));
                v.setModelo(rs.getString("modelo"));
                v.setAno(rs.getInt("ano"));
                v.setPlaca(rs.getString("placa"));
                v.setChassi(rs.getString("chassi"));
                v.setCor(rs.getString("cor"));
                v.setKm(rs.getInt("km"));
                v.setVeicAlugado(rs.getString("veicAlugado"));
                v.setTipo(rs.getString("tipo"));

                veiculos.add(v);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return veiculos;
    }

    public void Alterar(Veiculo veiculo) {
        String sql = "UPDATE Veiculos SET marca = ?, modelo = ?, ano = ?, placa = ?, chassi = ?, cor = ?, km = ?, veicAlugado = ?, tipo = ? WHERE idVeic = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, veiculo.getMarca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setInt(3, veiculo.getAno());
            stmt.setString(4, veiculo.getPlaca());
            stmt.setString(5, veiculo.getChassi());
            stmt.setString(6, veiculo.getCor());
            stmt.setInt(7, veiculo.getKm());
            stmt.setString(8, veiculo.getVeicAlugado());
            stmt.setString(9, veiculo.getTipo());
            stmt.setInt(10, veiculo.getId_veic());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            JOptionPane.showMessageDialog(null, "Erro na Atualização!");

        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }

    public int BuscarVeicAlugado(String placa) throws SQLException {
        String sql = "SELECT idVeic FROM Veiculos WHERE placa = '" + placa + "'";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idVeic = 0;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setIdAlug(rs.getInt("idVeic"));
                idVeic = rs.getInt("idVeic");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return idVeic;
    }

    public void Apagar(Veiculo veiculo) {
        String sql = "DELETE FROM Veiculos WHERE placa = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, veiculo.getPlaca());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veículo excluido com sucesso!");

        } catch (SQLException ex) {
            //System.err.println("Erro: " + ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir o veículo");

        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }
    public int BuscarVeic(String placa) throws SQLException {
        String sql = "SELECT idVeic FROM Veiculos WHERE placa = '" + placa + "'";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idVeic = 1;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setIdAlug(rs.getInt("idVeic"));
                idVeic = rs.getInt("idVeic");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return idVeic;
    }
    
    public String BuscarVeic2(String placa) throws SQLException {
        String sql = "SELECT modelo FROM Veiculos WHERE placa = '" + placa + "'";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        String modelo = "";
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setModelo(rs.getString("modelo"));
                modelo = rs.getString("modelo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return modelo;
    }
}
