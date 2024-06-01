package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por gerenciar a conexão com o banco de dados MySQL.
 * Utiliza o padrão Singleton para garantir uma única instância de conexão.
 */
public class Conexao {
    // Atributo estático que mantém a única instância da conexão
    private static Connection conexao;

    /**
     * Método estático que retorna a instância única da conexão com o banco de
     * dados.
     * 
     * @return Connection - Instância da conexão com o banco de dados.
     */
    public static Connection getConexao() {
        // Verifica se a conexão já foi estabelecida
        if (conexao == null) {
            // Configurações necessárias para a conexão com o banco de dados
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/motorista_aplicativo";
            String user = "root";
            String password = "seguRa1$";

            try {
                // Carrega o driver JDBC
                Class.forName(driver);
                // Estabelece a conexão com o banco de dados
                conexao = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão estabelecida com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                // Imprime a pilha de exceção em caso de erro
                e.printStackTrace();
            }
        }
        // Retorna a instância da conexão
        return conexao;
    }

    /**
     * Método principal para testar a conexão com o banco de dados.
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Obtém a conexão com o banco de dados
        Connection conn = getConexao();
        // Verifica se a conexão foi obtida com sucesso
        if (conn != null) {
            System.out.println("Conexão obtida no método main.");
        } else {
            System.out.println("Falha ao obter a conexão.");
        }
    }
}
