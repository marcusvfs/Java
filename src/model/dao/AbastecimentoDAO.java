package model.dao;

import connection.TesteBanco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Abastecimento;

/**
 *
 * @author Emersin
 */
public class AbastecimentoDAO {
    private Connection con = null;

    public AbastecimentoDAO() throws ClassNotFoundException {
        con = TesteBanco.getConnection();
    }

    public void inserir(Abastecimento abastecimento) {
        PreparedStatement stmt = null;
        CallableStatement calstat = null;

        try {
            calstat = con.prepareCall("{call inserirAbastecimento(?,?,?,?,?,?,?,?,?)}");
            calstat.setInt(1, abastecimento.getIdVeic());
            calstat.setString(2, abastecimento.getNomePosto());
            calstat.setString(3, abastecimento.getCupomFiscal());
            calstat.setInt(4, abastecimento.getKm());
            calstat.setFloat(5, abastecimento.getValorTotal());
            calstat.setString(6, abastecimento.getCombustivel());
            calstat.setInt(7, abastecimento.getLitros());
            calstat.setString(8, abastecimento.getDataAbastecimento());
            calstat.setString(9, abastecimento.getCnpj());
            
            calstat.executeUpdate();
            calstat.close();
            JOptionPane.showMessageDialog(null, "Dados do abastecimento inseridos com sucesso!");
            con.close();
            System.err.println("Inserido com sucessi!");
        } catch (SQLException ex) {
            System.err.println("Erroa aqui 1: " + ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados do abastecimento");
        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }

}
