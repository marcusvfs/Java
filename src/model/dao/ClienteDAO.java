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
import model.bean.Cliente;
import model.bean.Veiculo;

/**
 *
 * @author Emersin
 */
public class ClienteDAO {

    private Connection con = null;

    public ClienteDAO() {
        try {
            con = TesteBanco.getConnection();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conecão" + ex);
        }
    }

    public void inserir(Cliente cliente) {

        CallableStatement calstat = null;

        try {
            calstat = con.prepareCall("{call inserirCliente(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            calstat.setString(1, cliente.getRazaoSocial());
            calstat.setString(2, cliente.getEmpresa());
            calstat.setString(3, cliente.getCnpj());
            calstat.setString(4, cliente.getCidade());
            calstat.setString(5, cliente.getCep());
            calstat.setString(6, cliente.getUf());
            calstat.setString(7, cliente.getRua());
            calstat.setInt(8, cliente.getNumero());
            calstat.setString(9, cliente.getBairro());
            calstat.setString(10, cliente.getTelefone1());
            calstat.setString(11, cliente.getTelefone2());
            calstat.setString(12, cliente.getResponsavel());
            calstat.setString(13, cliente.getUsuario());
            calstat.setString(14, cliente.getSenha());

            calstat.executeUpdate();
            calstat.close();
            System.out.println("Your data has been inserted into table.");
            con.close();
            System.err.println("Inserido com sucessi!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na hora de inserir os dados!" + ex);
        } finally {
            TesteBanco.closerConnection(con);
        }
    }

    public int buscarCnpj(String cnpj) throws SQLException {
        String sql = "SELECT idCli FROM Clientes WHERE cnpj = '" + cnpj + "'";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idCliente = 1;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCli(rs.getInt("idCli"));
                idCliente = rs.getInt("idCli");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select 0" + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return idCliente;
    }

    public String buscarCnpj1(String cnpj) throws SQLException {
        String sql = "SELECT razaoSocial FROM Clientes WHERE cnpj = '" + cnpj + "'";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nomeCliente = "";
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setRazaoSocial(rs.getString("razaoSocial"));
                nomeCliente = rs.getString("razaoSocial");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select 1 " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return nomeCliente;
    }

    public List<Cliente> Buscar() {
        String sql = "SELECT * FROM Clientes";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCli(rs.getInt("idCli"));
                c.setEmpresa(rs.getString("nomeFantazia"));
                c.setRazaoSocial(rs.getString("razaoSocial"));
                c.setCnpj(rs.getString("cnpj"));
                c.setCidade(rs.getString("cidade"));
                c.setCep(rs.getString("cep"));
                c.setUf(rs.getString("uf"));
                c.setRua(rs.getString("rua"));
                c.setNumero(rs.getInt("numero"));
                c.setBairro(rs.getString("bairro"));
                c.setTelefone1(rs.getString("telefone"));
                c.setTelefone2(rs.getString("telefone2"));
                c.setResponsavel(rs.getString("responsavel"));
                c.setUsuario(rs.getString("usuario"));

                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return clientes;
    }
    public boolean checkLogin(String login, String senha) {
        

        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM Clientes WHERE usuario = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de logins disponíveis");
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return check;
    }
    public void Apagar(Cliente cliente) {
        String sql = "DELETE FROM Clientes WHERE cnpj = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getCnpj());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");

        } catch (SQLException ex) {
            //System.err.println("Erro: " + ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir o cliente");

        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }
    public void Alterar(Cliente cliente) {
        String sql = "UPDATE Clientes SET nomeFantazia = ?, razaoSocial = ?, cnpj = ?, cidade = ?, cep = ?, uf = ?, rua = ?, numero = ?, bairro = ?, telefone = ?, telefone2 = ?, responsavel = ? WHERE idCli = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getEmpresa());
            stmt.setString(2, cliente.getRazaoSocial());
            stmt.setString(3, cliente.getCnpj());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getCep());
            stmt.setString(6, cliente.getUf());
            stmt.setString(7, cliente.getRua());
            stmt.setInt(8, cliente.getNumero());
            stmt.setString(9, cliente.getBairro());
            stmt.setString(10, cliente.getTelefone1());
            stmt.setString(11, cliente.getTelefone2());
            stmt.setString(12, cliente.getResponsavel());
            stmt.setInt(13, cliente.getIdCli());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            JOptionPane.showMessageDialog(null, "Erro na Atualização!");

        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }
}
