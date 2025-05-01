package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Asiento")
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsiento;

    @Column(name = "seatNumberAsiento", nullable = false)
    private int seatNumberAsiento;

    @ManyToOne
    @JoinColumn(name = "idBus")
    private  Bus bus;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private  Estado estado;

    public Asiento() {
    }

    public Asiento(int idAsiento, int seatNumberAsiento, Bus bus, Estado estado) {
        this.idAsiento = idAsiento;
        this.seatNumberAsiento = seatNumberAsiento;
        this.bus = bus;
        this.estado = estado;
    }

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
