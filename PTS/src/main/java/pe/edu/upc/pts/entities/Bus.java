package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "Bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBus;

    @Column(name = "arrivalAddressBus", nullable = false, length = 100)
    private String arrivalAddressBus;

    @Column(name = "capacityBus", nullable = false)
    private int capacityBus;

    @Column(name = "durationBus", nullable = false)
    private LocalTime durationBus;

    @OneToOne
    @JoinColumn(name = "idViaje")
    private Viaje viaje;

    public Bus() {
    }

    public Bus(int idBus, String arrivalAddressBus, int capacityBus, LocalTime durationBus, Viaje viaje) {
        this.idBus = idBus;
        this.arrivalAddressBus = arrivalAddressBus;
        this.capacityBus = capacityBus;
        this.durationBus = durationBus;
        this.viaje = viaje;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public String getArrivalAddressBus() {
        return arrivalAddressBus;
    }

    public void setArrivalAddressBus(String arrivalAddressBus) {
        this.arrivalAddressBus = arrivalAddressBus;
    }

    public int getCapacityBus() {
        return capacityBus;
    }

    public void setCapacityBus(int capacityBus) {
        this.capacityBus = capacityBus;
    }

    public LocalTime getDurationBus() {
        return durationBus;
    }

    public void setDurationBus(LocalTime durationBus) {
        this.durationBus = durationBus;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
}
