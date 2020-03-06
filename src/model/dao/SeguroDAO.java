package model.dao;

import connection.TesteBanco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Seguro;
import model.bean.Veiculo;

/**
 *
 * @author Emersin
 */
public class SeguroDAO {

    private Connection con = null;

    public SeguroDAO() throws ClassNotFoundException {
        con = TesteBanco.getConnection();
    }

    public void inserir(Seguro seguro) {    
        PreparedStatement stmt = null;
        CallableStatement calstat = null;

        try {
            calstat = con.prepareCall("{call inserirSeguro(?,?,?,?,?,?,?,?,?,?,?)}");
            calstat.setInt(1, seguro.getIdVeic());
            calstat.setString(2, seguro.getSeguradora());
            calstat.setString(3, seguro.getApolice());
            calstat.setString(4, seguro.getCorretor());
            calstat.setFloat(5, seguro.getValorTotal());
            calstat.setFloat(6, seguro.getValorParcela());
            calstat.setString(7, seguro.getVencimento());
            calstat.setString(8, seguro.getFoneCorretor());
            calstat.setString(9, seguro.getCelular());
            calstat.setString(10, seguro.getFoneCorretor2());
            calstat.setString(11, seguro.getDescSinistro());

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
}    
