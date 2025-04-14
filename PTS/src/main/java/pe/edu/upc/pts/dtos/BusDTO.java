package pe.edu.upc.pts.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalTime;

public class BusDTO {
    private int idBus;
    private String arrivalAddressBus;
    private int capacityBus;
    private LocalTime durationBus;

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
}
