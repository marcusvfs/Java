package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteBanco {

    public static Connection getConnection() throws ClassNotFoundException {
        Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String URL = "jdbc:sqlserver://localhost:1433;databaseName=CapitalFrotas;user=pim;password=1234";
        try {
            con = DriverManager.getConnection(URL);
            System.out.println("Conectado com sucesso!");

        } catch (SQLException ex) {
            System.out.println("Erro na tentatica de conectar!");
        }
        return con;
    }

    public static void closerConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
    }

    public static void closerConnection(Connection con, PreparedStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closerConnection(con);
    }

    public static void closerConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closerConnection(con, stmt);
    }
}
