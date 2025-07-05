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

    @Column(name = "arrivalAddressBus", nullable = false, length = 100)
    private String arrivalAddressBus;

    @Column(name = "departureDateViaje", nullable = false)
    private LocalDate departureDateViaje;

    @Column(name = "priceViaje", nullable = false)
    private Double priceViaje;

    @Column(name = "departureTimeViaje", nullable = false)
    private LocalTime departureTimeViaje;

    @ManyToOne
    @JoinColumn(name = "idRuta")
    private Ruta ruta;

    public Viaje() {
    }

    public Viaje(int idViaje, String arrivalAddressBus, LocalDate departureDateViaje, Double priceViaje, LocalTime departureTimeViaje, Ruta ruta) {
        this.idViaje = idViaje;
        this.arrivalAddressBus = arrivalAddressBus;
        this.departureDateViaje = departureDateViaje;
        this.priceViaje = priceViaje;
        this.departureTimeViaje = departureTimeViaje;
        this.ruta = ruta;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getArrivalAddressBus() {
        return arrivalAddressBus;
    }

    public void setArrivalAddressBus(String arrivalAddressBus) {
        this.arrivalAddressBus = arrivalAddressBus;
    }

    public LocalDate getDepartureDateViaje() {
        return departureDateViaje;
    }

    public void setDepartureDateViaje(LocalDate departureDateViaje) {
        this.departureDateViaje = departureDateViaje;
    }

    public Double getPriceViaje() {
        return priceViaje;
    }

    public void setPriceViaje(Double priceViaje) {
        this.priceViaje = priceViaje;
    }

    public LocalTime getDepartureTimeViaje() {
        return departureTimeViaje;
    }

    public void setDepartureTimeViaje(LocalTime departureTimeViaje) {
        this.departureTimeViaje = departureTimeViaje;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
