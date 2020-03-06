package model.dao;

import connection.TesteBanco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Multa;

/**
 *
 * @author Emersin
 */
public class MultaDAO {
    private Connection con = null;

    public MultaDAO() throws ClassNotFoundException {
        con = TesteBanco.getConnection();
    }

    public void inserir(Multa multa) {
        
        PreparedStatement stmt = null;
        CallableStatement calstat = null;

        try {
            calstat = con.prepareCall("{call inserirMulta(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            calstat.setInt(1, multa.getIdVeic());
            calstat.setString(2, multa.getDataOcorrencia());
            calstat.setString(3, multa.getPotuacao());
            calstat.setString(4, multa.getGravidade());
            calstat.setString(5, multa.getInfracao());
            calstat.setString(6, multa.getCep());
            calstat.setString(7, multa.getUf());
            calstat.setString(8, multa.getCidade());
            calstat.setString(9, multa.getBairro());
            calstat.setString(10, multa.getRua());
            calstat.setInt(11, multa.getNumero());
            calstat.setFloat(12, multa.getValor());
            calstat.setString(13, multa.getDataNotificacao());
            calstat.setString(14, multa.getDataVencimento());
            calstat.setString(15, multa.getObervacao());
            calstat.setString(16, multa.getSituacao());

            calstat.executeUpdate();
            calstat.close();
            JOptionPane.showMessageDialog(null, "Dados da multa inseridos com sucesso!");
            con.close();
            System.err.println("Inserido com sucessi!");
        } catch (SQLException ex) {
            System.err.println("Erroa aqui 1: " + ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados da multa");
        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }

}
