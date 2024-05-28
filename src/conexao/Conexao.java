package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Connection conexao;

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                // Verifique se as informações de URL, usuário e senha estão corretas
                String url = "jdbc:mysql://localhost:3306/motorista_aplicativo";
                String user = "root";
                String password = "seguRa1$";

                conexao = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conexao;
    }

public static void main(String[] args) {
}
}
