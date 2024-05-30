import DAO.Arrecadado_diaDAO;
import entity.Arrecadado_dia;

public class App_arrecadado_dia {



    public static void main(String[] args) {
        
        Arrecadado_dia u = new Arrecadado_dia();
    

        u.setDia("2024-05-29");
        u.setPlaca_veiculo("SID0I77");
        u.setId_motorista("Márcio Almeida de Souza");
        u.setArrecadado_uber((float)158.34);
        u.setArrecadado_99((float)48.78);
        u.setArrecadado_indrive((float)0.00);
        u.setArrecadado_outros((float)0.00);


    new Arrecadado_diaDAO().cadastrarArrecadado_dia(u);
    }
}
