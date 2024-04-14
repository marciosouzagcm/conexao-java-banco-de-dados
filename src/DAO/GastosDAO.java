package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Gastos;

public class GastosDAO {
    
    public void cadastrarGastos(Gastos Gastos){

// Consulta SQL para inserir os dados do usuário na tabela 'arrecadado_dia'
String sql = "INSERT INTO GASTOS(dia, aluguel_veiculo, combustivel, imposto_previdência, imposto_privado, manutencao_veiculo, alimentacao,investimentos, consórcio) values (?,?,?,?)";

// Inicializando o PreparedStatement para executar instruções SQL
PreparedStatement ps = null;

    try {
        // Obtendo a instância de conexão da classe Connection
        ps = Conexao.getConexao().prepareStatement(sql);

        // Definindo parâmetros para o PreparedStatement com os dados do usuário
        ps.setString(1,Gastos.getDia());
        ps.setFloat(2, Gastos.getAluguel_veiculo());
        ps.setFloat(3, Gastos.getCombustivel());
        ps.setFloat(4, Gastos.getImposto_previdência());
        ps.setFloat(5, Gastos.getImposto_privado());
        ps.setFloat(6, Gastos.getManutencao_veiculo());
        ps.setFloat(7, Gastos.getAlimentacao());
        ps.setFloat(8, Gastos.getInvestimentos());
        ps.setFloat(9, Gastos.getConsórcio());

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