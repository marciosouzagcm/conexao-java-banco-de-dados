package telas;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DAO.Arrecadado_diaDAO;
import entity.Arrecadado_dia;

/**
 * Classe Tela_App_arrecadado_dia
 * Esta classe cria uma interface gráfica para capturar dados de arrecadação e
 * enviá-los para um banco de dados.
 * Extende JFrame para criar uma janela de aplicação.
 */
public class Tela_App_arrecadado_dia extends JFrame {

    private JTextField diaField;
    private JTextField placaField;
    private JTextField idMotoristaField;
    private JTextField arrecadadoUberField;
    private JTextField arrecadado99Field;
    private JTextField arrecadadoIndriveField;
    private JTextField arrecadadoOutrosField;
    private JButton submitButton;

    /**
     * Construtor da classe Tela_App_arrecadado_dia
     * Configura o JFrame e inicializa os componentes da interface gráfica.
     */
    public Tela_App_arrecadado_dia() {
        // Configurações do JFrame
        setTitle("Arrecadação do Dia"); // Título da janela
        setSize(400, 400); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ação ao fechar a janela
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Layout do JFrame
        setLayout(new GridLayout(8, 2)); // Define o layout de grade (8 linhas e 2 colunas)

        // Inicialização dos componentes do formulário
        JLabel diaLabel = new JLabel("Dia:");
        diaField = new JTextField();

        JLabel placaLabel = new JLabel("Placa do Veículo:");
        placaField = new JTextField();

        JLabel idMotoristaLabel = new JLabel("ID do Motorista:");
        idMotoristaField = new JTextField();

        JLabel arrecadadoUberLabel = new JLabel("Arrecadado Uber:");
        arrecadadoUberField = new JTextField();

        JLabel arrecadado99Label = new JLabel("Arrecadado 99:");
        arrecadado99Field = new JTextField();

        JLabel arrecadadoIndriveLabel = new JLabel("Arrecadado InDrive:");
        arrecadadoIndriveField = new JTextField();

        JLabel arrecadadoOutrosLabel = new JLabel("Arrecadado Outros:");
        arrecadadoOutrosField = new JTextField();

        submitButton = new JButton("Enviar"); // Botão para enviar os dados

        // Adiciona os componentes ao JFrame
        add(diaLabel);
        add(diaField);
        add(placaLabel);
        add(placaField);
        add(idMotoristaLabel);
        add(idMotoristaField);
        add(arrecadadoUberLabel);
        add(arrecadadoUberField);
        add(arrecadado99Label);
        add(arrecadado99Field);
        add(arrecadadoIndriveLabel);
        add(arrecadadoIndriveField);
        add(arrecadadoOutrosLabel);
        add(arrecadadoOutrosField);
        add(submitButton);

        // Adiciona ação ao botão
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarArrecadado_dia();
            }
        });
    }

    /**
     * Método para capturar os dados do formulário e cadastrar no banco de dados.
     */
    private void cadastrarArrecadado_dia() {
        try {
            // Cria um novo objeto Arrecadado_dia e preenche com os dados do formulário
            Arrecadado_dia arrecadado = new Arrecadado_dia();
            arrecadado.setDia(diaField.getText());
            arrecadado.setPlaca_veiculo(placaField.getText());
            arrecadado.setId_motorista(idMotoristaField.getText());
            arrecadado.setArrecadado_uber(Float.parseFloat(arrecadadoUberField.getText()));
            arrecadado.setArrecadado_99(Float.parseFloat(arrecadado99Field.getText()));
            arrecadado.setArrecadado_indrive(Float.parseFloat(arrecadadoIndriveField.getText()));
            arrecadado.setArrecadado_outros(Float.parseFloat(arrecadadoOutrosField.getText()));

            // Chama o DAO para salvar o objeto no banco de dados
            Arrecadado_diaDAO dao = new Arrecadado_diaDAO();
            dao.cadastrarArrecadado_dia(arrecadado);

            // Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Dados cadastrados com sucesso!");
        } catch (NumberFormatException ex) {
            // Exibe mensagem de erro se houver problemas na conversão de valores numéricos
            JOptionPane.showMessageDialog(this, "Erro nos valores inseridos. Verifique os dados e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Exibe mensagem de erro para qualquer outro problema
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método principal para iniciar a aplicação.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Cria e exibe a tela
        Tela_App_arrecadado_dia tela = new Tela_App_arrecadado_dia();
        tela.setVisible(true);
    }
}

