package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {
    
    // Constantes para conexão com o banco de dados
    private static final String driver = "com.mysql.jdbc.driver"; // Verifique se o nome do driver está correto
    private static final String url = "jdbc:mysql://localhost:3306/motorista_aplicativo";
    private static final String user = "root";
    private static final String password = "seguRa1$";

    // Variável que armazena a conexão
    public static Connection conector;

    // Método responsável por estabelecer a conexão com o banco
    public static Connection getConexao() {
        try {
            if (conector != null) {
                Class.forName(driver); // Certifique-se de que o driver JDBC está carregado
                conector = DriverManager.getConnection(url, user, password);
            }
            return conector; // Retorna a conexão existente ou recém-criada
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            return conector;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado: " + e.getMessage());
            return null;
        }
    }

    // Métodos para retornar valores das configurações (estes métodos não precisam de argumentos)
    public static String getUrl(String url) {
        return url;
    }

    public static String getUser(String user) {
        return user;
    }

    public static String getPassword(String password) {
        return password;
    }

    // Método para retornar o objeto de conexão
    public static Connection getConector() {
        return conector;
    }

    public static void main(String[] args) {
    Connection conector = Conexao.getConexao();
            if (conector == null) {
                System.out.println("Conexao estabelecida.");
            } else {
                System.out.println("Falha ao estabelecer conexao.");
            }
        }
    }


