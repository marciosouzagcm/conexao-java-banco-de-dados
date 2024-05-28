import DAO.GastosDAO;
import entity.Gastos;

public class App_gastos {



    public static void main(String[] args) {
       
        Gastos u = new Gastos();

        u.setDia("2024-05-19");
        u.setAluguel_veiculo((float)84.94);
        u.setCombustível((float)80.00);
        u.setImposto_previdência((float)0.00);
        u.setImposto_privado((float)0.00);
        u.setManutenção_veiculo((float)12.00);
        u.setAlimentação((float)7.00);
        u.setInvestimentos((float)0.00);
        u.setConsórcio((float)0.00);


    new GastosDAO().cadastrarGastos(u);

    }
}
