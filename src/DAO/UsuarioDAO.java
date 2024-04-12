package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

// Importando a classe de conexão para estabelecer uma conexão com o banco de dados
import conexao.Conexao;
import entity.Usuario;

// Esta classe manipula as operações de acesso a dados relacionadas aos usuários
public class UsuarioDAO {
    
// Método para cadastrar um novo usuário no banco de dados
public void cadastrarUsuario(Usuario usuario){

// Consulta SQL para inserir os dados do usuário na tabela 'arrecadado_dia'
String sql = "insert into arrecadado_dia (dia, placa_veiculo, id_motorista, arrecadado_uber, arrecadado_99, arrecadado_indrive, arrecadado_outros) values (?,?,?,?)";

// Inicializando o PreparedStatement para executar instruções SQL
PreparedStatement ps = null;

    try {
        // Obtendo a instância de conexão da classe Connection
        ps = Conexao.getConexao().prepareStatement(sql);

        // Definindo parâmetros para o PreparedStatement com os dados do usuário
        ps.setString(1, usuario.getDia());
        ps.setString(2, usuario.getPlaca_veiculo());
        ps.setString(3, usuario.getId_motorista());
        ps.setFloat(4, usuario.getArrecadado_uber());
        ps.setFloat(5, usuario.getArrecadado_99());
        ps.setFloat(6, usuario.getArrecadado_indrive());
        ps.setFloat(7, usuario.getArrecadado_outros());
        

        // Executando a instrução SQL
        ps.execute();
            
        // Fechando o PreparedStatement
        ps.close();

        } catch (SQLException e) {
            // Lidando com exceções SQL
            e.printStackTrace();
        }
    }
}