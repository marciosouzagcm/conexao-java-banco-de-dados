package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.Conexao;
import entity.Arrecadado_dia;

/**
 * Classe que manipula as operações de acesso a dados relacionadas à arrecadação do dia.
 */
public class Arrecadado_diaDAO {

    /**
     * Método para cadastrar uma nova arrecadação no banco de dados.
     * 
     * @param arrecadado_dia Objeto contendo os dados da arrecadação do dia.
     */
    public void cadastrarArrecadado_dia(Arrecadado_dia arrecadado_dia) {
        // Consulta SQL para inserir os dados da arrecadação na tabela arrecadado_dia
        String sql = "INSERT INTO arrecadado_dia(dia, placa_veiculo, id_motorista, arrecadado_uber, arrecadado_99, arrecadado_indrive, arrecadado_outros) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = Conexao.getConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            // Definindo parâmetros para o PreparedStatement com os dados da arrecadação
            ps.setString(1, arrecadado_dia.getDia());
            ps.setString(2, arrecadado_dia.getPlaca_veiculo());
            ps.setString(3, arrecadado_dia.getId_motorista());
            ps.setFloat(4, arrecadado_dia.getArrecadado_uber());
            ps.setFloat(5, arrecadado_dia.getArrecadado_99());
            ps.setFloat(6, arrecadado_dia.getArrecadado_indrive());
            ps.setFloat(7, arrecadado_dia.getArrecadado_outros());
            
            // Executando a instrução SQL
            ps.executeUpdate();
            
        } catch (SQLException e) {
            // Lidando com exceções SQL
            e.printStackTrace();
        }
    }
}
