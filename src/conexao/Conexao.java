package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Esta classe fornece uma conexão com o banco de dados MySQL (MÓDULO DE CONEXÃO=DRIVER,CAMINHO,NOME,AUTENTICAÇÃO)
public class Conexao {

// URL de conexão com o banco de dados
private static final String URL = "jdbc:Mysql://localhost:3306/motorista_aplicativo";

// Nome de usuário do banco de dados
private static final String  USER = "root";

// Senha do usuário do banco de dados
private static final String PASSWORD = "seguRa1$";

// Objeto de conexão
private static Connection conn;

// Método para obter a conexão com o banco de dados
public static Connection getConexao() {

    try {
        // Verifica se a conexão já foi estabelecida
        if(conn == null) {
            
        // Estabelece uma nova conexão se ainda não existir
        conn = DriverManager.getConnection (URL, USER, PASSWORD);
        return conn;
        } else {
        // Retorna a conexão existente se já foi estabelecida
        return conn;
        }
        
        } catch (SQLException e) {
            // Manipula exceções SQL imprimindo o rastreamento do erro
            e.printStackTrace();
            return null;
        }
    }
    // Método para retornar a URL de conexão
    public static String getUrl() {
        return URL;
    }
    // Método para retornar o nome de usuário
    public String getUser() {
        return USER;
    }
    // Método para retornar o nome de usuário
    public String getPassword(String password) {
        return password;
    }
    // Método para retornar o objeto de conexão
    public static Connection getConn() {
        return conn;
    }
    // Método para definir o objeto de conexão
    public static void setConn(Connection conn) {
        Conexao.conn = conn;
    }
}
