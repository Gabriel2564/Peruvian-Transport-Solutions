package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Asiento")
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsiento;
    @Column(name = "seat_number", nullable = false)
    private int seat_number;

    @ManyToOne
    @JoinColumn(name = "idBus")
    private  Bus bus;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private  Estado estado;

    public Asiento() {
    }

    public Asiento(int idAsiento, int seat_number, Bus bus, Estado estado) {
        this.idAsiento = idAsiento;
        this.seat_number = seat_number;
        this.bus = bus;
        this.estado = estado;
    }

    public int getIdAsiento() {return idAsiento;}

    public void setIdAsiento(int idAsiento) {this.idAsiento = idAsiento;}

    public int getSeat_number() {return seat_number;}

    public void setSeat_number(int seat_number) {this.seat_number = seat_number;}

    public Bus getBus() {return bus;}

    public void setBus(Bus bus) {this.bus = bus;}

    public Estado getEstado() {return estado;}

    public void setEstado(Estado estado) {this.estado = estado;}
}
