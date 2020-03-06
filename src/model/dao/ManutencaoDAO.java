package model.dao;

import connection.TesteBanco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Manutencao;

/**
 *
 * @author Emersin
 */
public class ManutencaoDAO {
     private Connection con = null;

    public ManutencaoDAO() throws ClassNotFoundException {
        con = TesteBanco.getConnection();
    }

    public void inserir(Manutencao manutencao) {
        PreparedStatement stmt = null;
        CallableStatement calstat = null;

        try {
            calstat = con.prepareCall("{call inserirManutencao(?,?,?,?,?,?,?,?)}");
            calstat.setInt(1, manutencao.getIdVeic());
            calstat.setFloat(2, manutencao.getValorTotal());
            calstat.setInt(3, manutencao.getKm());
            calstat.setString(4, manutencao.getEstabelecimento());
            calstat.setString(5, manutencao.getTelefone());
            calstat.setString(6, manutencao.getDataManutencao());
            calstat.setString(7, manutencao.getMotivo());
            calstat.setString(8, manutencao.getDescricao());
            
            calstat.executeUpdate();
            calstat.close();
            JOptionPane.showMessageDialog(null, "Dados da manutencao inseridos com sucesso!");
            con.close();
            System.err.println("Inserido com sucessi!");
        } catch (SQLException ex) {
            System.err.println("Erroa aqui 1: " + ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados da manutencao");
        } finally {
            TesteBanco.closerConnection(con, stmt);
        }
    }

}
