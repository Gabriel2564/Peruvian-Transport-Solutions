package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViaje;
    @Column(name = "fecha_salida", nullable = false, length = 100)
    private LocalDate fecha_salida;
    @Column(name = "precio", nullable = false, length = 100)
    private Double precio;
    @Column(name = "hora_salida", nullable = false, length = 100)
    private LocalTime hora_salida;
    @ManyToOne
    @JoinColumn(name = "idRuta")
    private Ruta ruta;

    public Viaje() {
    }

    public Viaje(int idViaje, LocalDate fecha_salida, Double precio, LocalTime hora_salida, Ruta ruta) {
        this.idViaje = idViaje;
        this.fecha_salida = fecha_salida;
        this.precio = precio;
        this.hora_salida = hora_salida;
        this.ruta = ruta;
    }

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
