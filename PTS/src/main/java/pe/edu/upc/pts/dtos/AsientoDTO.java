package pe.edu.upc.pts.dtos;
import pe.edu.upc.pts.entities.Bus;
import pe.edu.upc.pts.entities.Estado;


public class AsientoDTO {
    private int idAsiento;
    private int seatNumberAsiento;
    private  Bus bus;
    private  Estado estado;

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getSeatNumberAsiento() {
        return seatNumberAsiento;
    }

    public void setSeatNumberAsiento(int seatNumberAsiento) {
        this.seatNumberAsiento = seatNumberAsiento;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
