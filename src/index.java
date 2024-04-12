import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class index {
    public void cadastrararrecado_dia(index u) throws Exception {
        // Configurações do banco de dados
        String url = "jdbc:mysql://localhost:3306/motorista_aplicatico";
        String usuario = "root";
        String senha = "seguRa1$";

        // Conectar ao banco de dados
        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        // Declaração SQL para inserir os dados
        String sql = "INSERT INTO nome_da_tabela (dia, placa_veiculo, id_motorista, arrecadado_uber, arrecadado_99, arrecadado_indrive, arrecadado_outros) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        // Preparar a declaração SQL
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, u.getDia());
        statement.setString(2, u.getPlaca_veiculo());
        statement.setString(3, u.getId_motorista());
        statement.setDouble(4, u.getArrecadado_uber());
        statement.setDouble(5, u.getArrecadado_uber());
        statement.setDouble(6, u.getArrecadado_indrive());
        statement.setDouble(7, u.getArrecadado_outros());

        // Executar a declaração SQL
        statement.executeUpdate();

        // Fechar a conexão com o banco de dados
        conexao.close();
    }

    private double getArrecadado_outros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArrecadado_outros'");
    }

    private double getArrecadado_indrive() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArrecadado_indrive'");
    }

    private double getArrecadado_uber() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArrecadado_uber'");
    }

    private String getId_motorista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId_motorista'");
    }

    private String getPlaca_veiculo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlaca_veiculo'");
    }

    private String getDia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDia'");
    }
}
