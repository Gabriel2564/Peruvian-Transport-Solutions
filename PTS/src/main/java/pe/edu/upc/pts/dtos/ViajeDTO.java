package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Ruta;

import java.time.LocalDate;
import java.time.LocalTime;

public class ViajeDTO {
    private int idViaje;
    private LocalDate departureDateViaje;
    private Double priceViaje;
    private LocalTime departureTimeViaje;
    private Ruta ruta;

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
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
