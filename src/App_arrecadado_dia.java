import DAO.Arrecadado_diaDAO;
import entity.Arrecadado_dia;

public class App_arrecadado_dia {



    public static void main(String[] args) {
       
        Arrecadado_dia u = new Arrecadado_dia();

        u.setDia("  ");
        u.setPlaca_veiculo("  ");
        u.setId_motorista("  ");
        u.setArrecadado_uber((float)0.00);
        u.setArrecadado_99((float)0.00);
        u.setArrecadado_indrive((float)0.00);
        u.setArrecadado_outros((float)0.00);


    new Arrecadado_diaDAO().cadastrarArrecadado_dia(u);

    }
}

