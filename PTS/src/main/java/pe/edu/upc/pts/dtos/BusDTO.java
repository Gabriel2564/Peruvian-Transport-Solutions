package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Viaje;

import java.time.LocalTime;

public class BusDTO {
    private int idBus;
    private int capacityBus;
    private LocalTime durationBus;
    private Viaje viaje;

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
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
