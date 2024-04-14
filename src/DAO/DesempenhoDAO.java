package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Desempenho;

public class DesempenhoDAO {

    public void cadastrarDesempenho(Desempenho Desempenho){

// Consulta SQL para inserir os dados do usuário na tabela 'arrecadado_dia'
String sql = "INSERT INTO DESEMPENHO(corridas_dia_uber, corridas_dia_99, corridas_dia_indrive, online_uber,online_99, online_indrive, total_km_dia) values (?,?,?,?)";

// Inicializando o PreparedStatement para executar instruções SQL
PreparedStatement ps = null;

    try {
        // Obtendo a instância de conexão da classe Connection
        ps = Conexao.getConexao().prepareStatement(sql);

        // Definindo parâmetros para o PreparedStatement com os dados do usuário
        ps.setInt(1,Desempenho.getCorridas_dia_uber());
        ps.setInt(2, Desempenho.getCorridas_dia_99());
        ps.setInt(3, Desempenho.getCorridas_dia_indrive());
        ps.setString(4, Desempenho.getOnline_uber());
        ps.setString(5, Desempenho.getOnline_99());
        ps.setString(6, Desempenho.getOnline_indrive());
        ps.setFloat(7, Desempenho.getTotal_km_dia());

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