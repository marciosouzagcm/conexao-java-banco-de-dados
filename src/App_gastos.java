import DAO.GastosDAO;
import entity.Gastos;

public class App_gastos {



    public static void main(String[] args) {
       
        Gastos u = new Gastos();

        u.setDia("2024-04-20");
        u.setAluguel_veiculo((float)84.94);
        u.setCombustível((float)80.00);
        u.setImposto_previdência((float)0.00);
        u.setImposto_privado((float)15.90);
        u.setManutenção_veiculo((float)0.00);
        u.setAlimentação((float)61.00);
        u.setInvestimentos((float)0.00);
        u.setConsórcio((float)0.00);


    new GastosDAO().cadastrarGastos(u);

    }
}
