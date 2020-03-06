package model.dao;

import connection.TesteBanco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Viagens;

public class ViagemDAO {
    private Connection con = null;

    public ViagemDAO() {
        try {
            con = TesteBanco.getConnection();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão" + ex);
        }
    }
    
    public void inserir(Viagens v){
        PreparedStatement stmt = null;
        CallableStatement calstat= null;

        try {
            calstat=con.prepareCall("{call inserirViagem(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            calstat.setInt(1,v.getIdVeic());
            calstat.setString(2, v.getMotivo());
            calstat.setInt(3, v.getKmInicial());
            calstat.setInt(4, v.getKmFinal());
            calstat.setString(5, v.getDataViagem());
            calstat.setString(6, v.getDataFinal());
            calstat.setString(7, v.getCep());
            calstat.setString(8, v.getRua());
            calstat.setInt(9, v.getNumero());
            calstat.setString(10, v.getBairro());
            calstat.setString(11, v.getCidade());
            calstat.setString(12, v.getUf());
            calstat.setString(13, v.getHoraInicio());
            calstat.setString(14, v.getHoraFinal());           
            
            calstat.executeUpdate();
            calstat.close();
            JOptionPane.showMessageDialog(null, "Dados da viagem inseridos com sucesso");
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir: "  + ex);
        }finally{
            TesteBanco.closerConnection(con, stmt);
        }
    }
}
