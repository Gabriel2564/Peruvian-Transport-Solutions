package pe.edu.upc.pts.dtos;
import pe.edu.upc.pts.entities.Bus;
import pe.edu.upc.pts.entities.Estado;

public class AsientoDTO {
    private int idAsiento;
    private int seat_number;

    private Estado estado;
    private Bus bus;

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getSeat_number() {return seat_number;}

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
