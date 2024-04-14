import DAO.Arrecadado_diaDAO;
import entity.Arrecadado_dia;

public class App_arrecadado_dia {



    public static void main(String[] args) throws Exception {
       
        Arrecadado_dia u = new Arrecadado_dia();

        u.setDia("200240414");
        u.setPlaca_veiculo("SDI0I76");
        u.setId_motorista("Márcio Almeida de Souza");
        u.setArrecadado_uber((float) 130.00);
        u.setArrecadado_indrive((float)50.00);
        u.setArrecadado_outros((float)25.00);


    new Arrecadado_diaDAO().cadastrarArrecadado_dia(u);

    }
}

