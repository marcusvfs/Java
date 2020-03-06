/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.TesteBanco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Motorista;
import model.bean.Veiculo;

/**
 *
 * @author Emersin
 */
public class MotoristaDAO {

    private Connection con = null;

    public MotoristaDAO() {
        try {
            con = TesteBanco.getConnection();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão" + ex);
        }
    }

    public void inserir(Motorista motorista) {
        CallableStatement calstat = null;

        try {
            calstat = con.prepareCall("{call InserirMotorista(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            calstat.setString(1, motorista.getNome());
            calstat.setString(2, motorista.getSobrenome());
            calstat.setString(3, motorista.getRg());
            calstat.setString(4, motorista.getCpf());
            calstat.setString(5, motorista.getTelefone());
            calstat.setString(6, motorista.getCelular());
            calstat.setString(7, motorista.getValidade());
            calstat.setString(8, motorista.getRegistro());
            calstat.setString(9, motorista.getUf());
            calstat.setString(10, motorista.getCidade());
            calstat.setString(11, motorista.getRua());
            calstat.setString(12, motorista.getCep());
            calstat.setInt(13, motorista.getNumero());
            calstat.setString(14, motorista.getBairro());
            calstat.setString(15, motorista.getSexo());
            calstat.setInt(16, motorista.getId_veiculo());

            calstat.executeUpdate();
            calstat.close();
            JOptionPane.showMessageDialog(null, "Dados Inseridos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na hora de inserir os dados!" + ex);
        } finally {
            TesteBanco.closerConnection(con);
        }
    }

    public List<Motorista> Buscar() {
        String sql = "SELECT * FROM Motoristas";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Motorista> motoristas = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Motorista m = new Motorista();
                m.setId_motorista(rs.getInt("idMoto"));
                m.setNome(rs.getString("nome"));
                m.setSobrenome(rs.getString("sobrenome"));
                m.setRg(rs.getString("rg"));
                m.setCpf(rs.getString("cpf"));
                m.setTelefone(rs.getString("telefone"));
                m.setCelular(rs.getString("telefone2"));
                m.setValidade(rs.getString("cnh_Validade"));
                m.setRegistro(rs.getString("cnh_Registro"));
                m.setUf(rs.getString("uf"));
                m.setCidade(rs.getString("cidade"));
                m.setRua(rs.getString("rua"));
                m.setCep(rs.getString("cep"));
                m.setNumero(rs.getInt("numero"));
                m.setBairro(rs.getString("bairro"));
                m.setSexo(rs.getString("sexo")); 
                motoristas.add(m);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return motoristas;
    }

    public void Alterar(Motorista motorista) {
        String sql = "UPDATE Motoristas SET nome = ?, sobrenome = ?, rg = ?, cpf = ?, telefone = ?, telefone2 = ?, cnh_Validade = ?, cnh_Registro = ?, uf = ?, cidade = ?, rua = ?, cep = ?, numero = ?, bairro = ?, sexo = ? WHERE idVeic = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, motorista.getNome());
            stmt.setString(2, motorista.getSobrenome());
            stmt.setString(3, motorista.getRg());
            stmt.setString(4, motorista.getCpf());
            stmt.setString(5, motorista.getTelefone());
            stmt.setString(6, motorista.getCelular());
            stmt.setString(7, motorista.getValidade());
            stmt.setString(8, motorista.getRegistro());
            stmt.setString(9, motorista.getUf());
            stmt.setString(10, motorista.getCidade());
            stmt.setString(11, motorista.getRua());
            stmt.setString(12, motorista.getCep());
            stmt.setInt(13, motorista.getNumero());
            stmt.setString(14, motorista.getBairro());
            stmt.setString(15, motorista.getSexo());
            stmt.setInt(16, motorista.getId_motorista());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            JOptionPane.showMessageDialog(null, "Erro na Atualização!");

        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }

    public void Apagar(Motorista motorista) {
        String sql = "DELETE FROM Motoristas WHERE cpf = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, motorista.getCpf());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Motorista excluido com sucesso!");

        } catch (SQLException ex) {
            //System.err.println("Erro: " + ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir o motorista");

        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }
    
    public int BuscarMotorista(String cnh) throws SQLException {
        String sql = "SELECT idMoto FROM Motoristas WHERE cnh_Registro = '" + cnh + "'";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idMoto = 1;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Motorista m = new Motorista();
                m.setId_motorista(rs.getInt("idMoto"));
                idMoto = rs.getInt("idMoto");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return idMoto;
    }
    
    public String BuscarMotorista2(String cnh) throws SQLException {
        String sql = "SELECT nome FROM Motoristas WHERE cnh_Registro = '" + cnh + "'";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nome = "";
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Motorista m = new Motorista();
                m.setNome(rs.getString("nome"));
                nome = rs.getString("nome");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return nome;
    }
}
