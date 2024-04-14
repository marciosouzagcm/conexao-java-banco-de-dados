package entity;

public class Desempenho {
    
    
    private int corridas_dia_uber;
    private int corridas_dia_99;
    private int corridas_dia_indrive;
    private String online_uber;
    private String online_99;
    private String online_indrive;
    private float total_km_dia;


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
}

