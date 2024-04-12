

public class App {
    private static final String dia = null;

    /**
     *
     */
    public static void main(String[] args) throws Exception {
       
        arrecadado_dia u = new arrecadado_dia();
        u.setDia("200240412");
        u.setPlaca_veiculo("SDI0I76");
        u.setId_motorista("Márcio Almeida de Souza");
        u.setArrecadado_uber(120.00);
        u.setArrecadado_99(130.00);
        u.setArrecadado_indrive(0.00);
        u.setArrecadado_outros(0.00);

        new arrecadado_dia().cadastrararrecado_dia(u);
    }

    @Override
    public String toString() {
        return "App []";
    }
}