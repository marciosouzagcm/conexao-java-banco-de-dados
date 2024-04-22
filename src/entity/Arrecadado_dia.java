package entity;

// Classe que representa um usuário
public class Arrecadado_dia {

    public static String dia;
    private static String placa_veiculo;
    private static String id_motorista;
    private static float arrecadado_uber;
    private static float arrecadado_99;
    private static float arrecadado_indrive;
    private static float arrecadado_outros;

    // Atributos do usuário
    public static String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public static String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public static String getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(String id_motorista) {
        this.id_motorista = id_motorista;
    }

    public static Float getArrecadado_uber() {
        return arrecadado_uber;
    }

    public void setArrecadado_uber(float arrecadado_uber) {
        this.arrecadado_uber = arrecadado_uber;
    }

    public static Float getArrecadado_99() {
        return arrecadado_99;
    }

    public void setArrecadado_99(float arrecadado_99) {
        this.arrecadado_99 = arrecadado_99;
    }

    public static float getArrecadado_indrive() {
        return arrecadado_indrive;
    }

    public void setArrecadado_indrive(float arrecadado_indrive) {
        this.arrecadado_indrive = arrecadado_indrive;
    }

    public static float getArrecadado_outros() {
        return arrecadado_outros;
    }

    public void setArrecadado_outros(float arrecadado_outros) {
        this.arrecadado_outros = arrecadado_outros;
    }
}
