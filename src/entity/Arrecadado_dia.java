package entity;

// Classe que representa um usuário
public class Arrecadado_dia {

    public static String dia;
    private static String placa_veiculo;
    private static String id_motorista;
    private static Float arrecadado_uber;
    private static float arrecadado_indrive;
    private static float arrecadado_outros;
    private float aluguel_veiculo;
    private float combustivel;
    private float imposto_previdência;
    private float imposto_privado;
    private float alimentacao;
    private float manutencao_veiculo;
    private float investimentos;
    private float consórcio;
    private int corridas_dia_uber;
    private int corridas_dia_99;
    private int corridas_dia_indrive;
    private String online_uber;
    private String online_99;
    private String online_indrive;
    private float total_km_dia;
    private float arrecadado_99;

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
    public void setArrecadado_uber(double d) {
        this.arrecadado_uber = arrecadado_uber;
    }
    public void setArrecadado_99(double d) {
        this.arrecadado_99 = (float) d;
    }
    public static float getArrecadado_indrive() {
        return arrecadado_indrive;
    }
    public void setArrecadado_indrive(double d) {
        this.arrecadado_indrive = (float) d;
    }
    
    public static float getArrecadado_outros() {
        return arrecadado_outros;
    }
    public void setArrecadado_outros(double d) {
        this.arrecadado_outros = (float) d;
    }
    public float getAluguel_veiculo() {
        return aluguel_veiculo;
    }

    public void setAluguel_veiculo(float aluguel_veiculo) {
        this.aluguel_veiculo = aluguel_veiculo;
    }
    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public float getImposto_previdência() {
        return imposto_previdência;
    }

    public void setImposto_previdência(float imposto_previdência) {
        this.imposto_previdência = imposto_previdência;
    }
    public float getImposto_privado() {
        return imposto_privado;
    }
    public void setImposto_privado(float imposto_privado) {
        this.imposto_privado = imposto_privado;
    }
    public float getAlimentacao() {
        return alimentacao;
    }
    public void setAlimentacao(float alimentacao) {
        this.alimentacao = alimentacao;
    }
    public float getManutencao_veiculo() {
        return manutencao_veiculo;
    }
    public void setManutencao_veiculo(float manutencao_veiculo) {
        this.manutencao_veiculo = manutencao_veiculo;
    }
    public float getInvestimentos() {
        return investimentos;
    }
    public void setInvestimentos(float investimentos) {
        this.investimentos = investimentos;
    }
    public float getConsórcio() {
        return consórcio;
    }
    public void setConsórcio(float consórcio) {
        this.consórcio = consórcio;
    }
    public int getCorridas_dia_uber() {
        return corridas_dia_uber;
    }
    public void setCorridas_dia_uber(int corridas_dia_uber) {
        this.corridas_dia_uber = corridas_dia_uber;
    }
    public int getCorridas_dia_99() {
        return corridas_dia_99;
    }
    public void setCorridas_dia_99(int corridas_dia_99) {
        this.corridas_dia_99 = corridas_dia_99;
    }
    public int getCorridas_dia_indrive() {
        return corridas_dia_indrive;
    }
    public void setCorridas_dia_indrive(int corridas_dia_indrive) {
        this.corridas_dia_indrive = corridas_dia_indrive;
    }
    public String getOnline_uber() {
        return online_uber;
    }
    public void setOnline_uber(String online_uber) {
        this.online_uber = online_uber;
    }
    public String getOnline_99() {
        return online_99;
    }
    public void setOnline_99(String online_99) {
        this.online_99 = online_99;
    }
    public String getOnline_indrive() {
        return online_indrive;
    }
    public void setOnline_indrive(String online_indrive) {
        this.online_indrive = online_indrive;
    }
    public float getTotal_km_dia() {
        return total_km_dia;
    }
    public void setTotal_km_dia(float total_km_dia) {
        this.total_km_dia = total_km_dia;
    }
    public static float getArrecadado_99() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArrecadado_99'");
    }
}

