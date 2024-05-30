package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Connection conexao;

    public static Connection getConexao() {
        if (conexao == null) {
            // Verifique se as informações de URL, usuário e senha estão corretas
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/motorista_aplicativo";
            String user = "root";
            String password = "seguRa1$";
            // Estabelecendo conexao com banco de dados
            try {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão estabelecida com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return conexao;
    }

    public static void main(String[] args) {
        Connection conn = getConexao();
        if (conn != null) {
            System.out.println("Conexão obtida no método main.");
        } else {
            System.out.println("Falha ao obter a conexão.");
        }
    }
}

