package entity;

/**
 * Classe que representa a arrecadação do dia.
 */
public class Arrecadado_dia {

    // Atributos da arrecadação do dia
    private String dia;
    private String placa_veiculo;
    private String id_motorista;
    private float arrecadado_uber;
    private float arrecadado_99;
    private float arrecadado_indrive;
    private float arrecadado_outros;

    // Getters e setters para os atributos
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public String getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(String id_motorista) {
        this.id_motorista = id_motorista;
    }

    public float getArrecadado_uber() {
        return arrecadado_uber;
    }

    public void setArrecadado_uber(float arrecadado_uber) {
        this.arrecadado_uber = arrecadado_uber;
    }

    public float getArrecadado_99() {
        return arrecadado_99;
    }

    public void setArrecadado_99(float arrecadado_99) {
        this.arrecadado_99 = arrecadado_99;
    }

    public float getArrecadado_indrive() {
        return arrecadado_indrive;
    }

    public void setArrecadado_indrive(float arrecadado_indrive) {
        this.arrecadado_indrive = arrecadado_indrive;
    }

    public float getArrecadado_outros() {
        return arrecadado_outros;
    }

    public void setArrecadado_outros(float arrecadado_outros) {
        this.arrecadado_outros = arrecadado_outros;
    }
}
