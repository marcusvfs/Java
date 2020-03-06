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
import model.bean.Aluguel;
import model.bean.VeiculoAlugado;

/**
 *
 * @author Emersin
 */
public class AluguelDAO {

    private Connection con = null;

    public AluguelDAO() {
        try {
            con = TesteBanco.getConnection();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão" + ex);
        }
    }
    
    public void inserir(VeiculoAlugado veicAlug){
        PreparedStatement stmt = null;
        CallableStatement calstat= null;

        try {
            calstat=con.prepareCall("{call inserirAlugado(?,?,?,?,?,?,?,?,?)}");
            calstat.setString(1,veicAlug.getMarca());
            calstat.setString(2, veicAlug.getModelo());
            calstat.setInt(3, veicAlug.getAno());
            calstat.setString(4, veicAlug.getPlaca());
            calstat.setString(5, veicAlug.getChassi());
            calstat.setString(6, veicAlug.getCor());
            calstat.setInt(7, veicAlug.getKm());
            calstat.setString(8, veicAlug.getTipo());
            calstat.setString(9, veicAlug.getVeicAlugado());
            
            
            calstat.executeUpdate();
            calstat.close();
            System.out.println("Your data has been inserted into table.");
            con.close();
            System.err.println("Inserido com sucessi!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir: "  + ex);
        }finally{
            TesteBanco.closerConnection(con, stmt);
        }
    }

    public int BuscarVeicAlugado(String placa) throws SQLException {
        String sql = "SELECT idAlug FROM Aluguel WHERE placa = '" + placa + "'";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idAlug = 1;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Aluguel c = new Aluguel();
                c.setIdAlug(rs.getInt("idAlug"));
                idAlug = rs.getInt("idAlug");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return idAlug;
    }

    public Aluguel bucarId(Aluguel mod) throws SQLException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection con = null;
        stmt = (PreparedStatement) con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
        String sql = "SELECT marca, modelo, ano, placa, chassi, cor, km, tipo FROM Aluguel WHERE idAlug =  " + mod.getIdAlug();
        try {
            //con.rs.first();
            mod.setMarca(rs.getString("marca"));
            mod.setModelo(rs.getString("modelo"));
            mod.setPlaca(rs.getString("placa"));
            mod.setCor(rs.getString("cor"));
            mod.setAno(rs.getInt("ano"));
            mod.setTipo(rs.getString("tipo"));
            mod.setKm(rs.getInt("km"));
            mod.setchassi(rs.getString("chassi"));
            mod.setVeicAlugado(rs.getString("veicAlugado"));
            rs = stmt.executeQuery(sql);
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select geral aluguel: \nErro" + ex);
        }

        return mod;
    }


public List<VeiculoAlugado> Buscar() {
        String sql = "SELECT * FROM Aluguel";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<VeiculoAlugado> aluguel = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                VeiculoAlugado va = new VeiculoAlugado();
                va.setIdAlug(rs.getInt("idAlug"));
                va.setMarca(rs.getString("marca"));
                va.setModelo(rs.getString("modelo"));
                va.setAno(rs.getInt("ano"));
                va.setPlaca(rs.getString("placa"));
                va.setChassi(rs.getString("chassi"));
                va.setCor(rs.getString("cor"));
                va.setKm(rs.getInt("km"));
                va.setTipo(rs.getString("tipo"));
                va.setVeicAlugado(rs.getString("veicAlugado"));
                
                aluguel.add(va);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt, rs);
        }
        return aluguel;
    }
}


