package telas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import conexao.Conexao;





public class TelaLogin extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private Connection conexao; // Definindo a variável de conexão aqui

    public TelaLogin() {
        setTitle("System-Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }


    private void initComponents() {
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        userLabel = new JLabel("Usuário:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.EAST;
        panel.add(userLabel, constraints);

        userTextField = new JTextField(20);
        constraints.gridx = 1;
        panel.add(userTextField, constraints);

        passwordLabel = new JLabel("Senha:");
        constraints.gridy = 1;
        constraints.gridx = 0;
        panel.add(passwordLabel, constraints);

        passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        panel.add(passwordField, constraints);

        loginButton = new JButton("Login");
        constraints.gridy = 2;
        constraints.gridx = 1;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(loginButton, constraints);

        loginButton.addActionListener(this);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            logar();
        }
    }

    private void logar() {
        String usuario = userTextField.getText();
        String senha = new String(passwordField.getPassword());

        if (validarLogin(usuario, senha)) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            // Se o login for bem-sucedido, você pode fazer algo aqui, como abrir outra janela
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!");
        }
    }

    private boolean validarLogin(String usuario, String senha) {
        // Certifique-se de que a conexão não seja nula antes de usar
        if (conexao != null) {
            try (PreparedStatement pst = conexao.prepareStatement("SELECT * FROM usuarios WHERE user = ? AND password = ?")) {
                pst.setString(1, usuario);
                pst.setString(2, senha);
                try (ResultSet rs = pst.executeQuery()) {
                    return rs.next(); // Retorna true se houver um registro correspondente
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados");
        }
        return false;
    }

   
        public static void main(String[] args) {
        Conexao conector = new Conexao();
            // Inicialize sua conexão aqui
        
            // Crie uma instância de TelaLogin passando a conexão como parâmetro
            new TelaLogin();
        }
    }
    