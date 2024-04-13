import entity.Arrecadado_dia;

public class App {
    private static final String dia = null;
    private static final String New = null;


    public static <Arrecadado_dia> void main(String[] args) throws Exception {
       
        entity.Arrecadado_dia u = new entity.Arrecadado_dia();
        u.setDia("200240413");
        u.setPlaca_veiculo("SDI0I76");
        u.setId_motorista("Márcio Almeida de Souza");
        u.setArrecadado_99(130.00);
        u.setArrecadado_indrive(50.00);
        u.setArrecadado_outros(25.00);
    }

    private static void extracted(entity.Arrecadado_dia u) {
        u.setArrecadado_uber(120.00);
    }

    @Override
    public String toString() {
        return "App []";
    }

	public static float getArrecadado_99() {
	    return getArrecadado_99();
	}
}