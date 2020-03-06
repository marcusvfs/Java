package model.dao;

import connection.TesteBanco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Pneu;

/**
 *
 * @author Emersin
 */
public class PneuDAO {

    private Connection con = null;

    public PneuDAO() {
        try {
            con = TesteBanco.getConnection();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão" + ex);
        }
    }

    public void inserir(Pneu pneu) {
        PreparedStatement stmt = null;
        CallableStatement calstat = null;

        try {
            calstat = con.prepareCall("{call inserirPneu(?,?,?,?,?,?,?,?)}");
            calstat.setInt(1, pneu.getIdVeic());
            calstat.setInt(2, pneu.getDtProduzido());
            calstat.setString(3, pneu.getLargura());
            calstat.setString(4, pneu.getAltura());
            calstat.setString(5, pneu.getAro());
            calstat.setFloat(6, pneu.getProfundidade());
            calstat.setString(7, pneu.getnSerie());
            calstat.setInt(8, pneu.getKmPneu());

            calstat.executeUpdate();
            calstat.close();
            JOptionPane.showMessageDialog(null, "Dados do pneu inseridos com sucesso!");
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados do pneu: " + ex);
        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }
}
