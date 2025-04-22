package pe.edu.upc.pts.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class ViajeDTO {
    private int idViaje;
    private LocalDate fecha_salida;
    private Double precio;
    private LocalTime hora_salida;

    private  Ruta ruta;

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalTime getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(LocalTime hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
