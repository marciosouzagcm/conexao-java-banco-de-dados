package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Arrecadado_dia;

// Esta classe manipula as operações de acesso a dados relacionadas aos usuários
public class UsuarioDAO {
    
// Método para cadastrar um novo usuário no banco de dados

public void cadastrarArrecadado_dia(final UsuarioDAO UsuarioDAO){

// Consulta SQL para inserir os dados do usuário na tabela 'arrecadado_dia'
String sql = "insert into arrecadado_dia (dia, placa_veiculo, id_motorista, arrecadado_uber, arrecadado_99, arrecadado_indrive, arrecadado_outros) values (?,?,?,?)";

// Inicializando o PreparedStatement para executar instruções SQL
PreparedStatement ps = null;

    try {
        // Obtendo a instância de conexão da classe Connection
        ps = Conexao.getConexao().prepareStatement(sql);

        // Definindo parâmetros para o PreparedStatement com os dados do usuário
        ps.setString(1, Arrecadado_dia.getDia());
        ps.setString(2, Arrecadado_dia.getPlaca_veiculo());
        ps.setString(3, Arrecadado_dia.getId_motorista());
        ps.setFloat(4, Arrecadado_dia.getArrecadado_uber());
        ps.setFloat(5, Arrecadado_dia.getArrecadado_99());
        ps.setFloat(6, Arrecadado_dia.getArrecadado_indrive());
        ps.setFloat(7, Arrecadado_dia.getArrecadado_outros());
        

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

