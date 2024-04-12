import entity.Usuario;
import entity.arrecadado_dia;

public class App {
    private static final String dia = null;

    /**
     *
     */
    public static void main(String[] args) throws Exception {
       
        Usuario u = new usuario();
        u.setDia("200240402");
        u.setPlaca_veiculo("SDI0I76");
        u.setId_motorista("Márcio Almeida de Souza");
        u.setArrecadado_uber(120.00);
        u.setArrecadado_99(130.00);
        u.setArrecadado_indrive(0.00);
        u.setArrecadado_outros(0.00);

        @Override
    public String toString() {
        return "App []";
        
