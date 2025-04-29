package pe.edu.upc.pts.dtos;

public class PorcentajeEstadoXAsientoDTO {
    private String stateName;       // Nombre del Estado (Ejemplo: "Libre", "Reservado")
    private String stateType;       // Tipo del Estado si aplica (opcional)
    private long totalAsientos;     // Total de asientos en ese estado
    private double porcentaje;

    public String getStateName() {return stateName;}

    public void setStateName(String stateName) {this.stateName = stateName;}

    public String getStateType() {return stateType;}

    public void setStateType(String stateType) {this.stateType = stateType;}

    public long getTotalAsientos() {return totalAsientos;}

    public void setTotalAsientos(long totalAsientos) {this.totalAsientos = totalAsientos;}

    public double getPorcentaje() {return porcentaje;}

    public void setPorcentaje(double porcentaje) {this.porcentaje = porcentaje;}
}
