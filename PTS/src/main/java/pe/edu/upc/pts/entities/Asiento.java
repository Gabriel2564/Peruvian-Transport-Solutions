package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Asiento")
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsiento;
    @Column(name = "numero_asiento", nullable = false)
    private int numero_asiento;

    @ManyToOne
    @JoinColumn(name = "idBus")
    private  Bus bus;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private  Estado estado;

    public Asiento() {
    }

    public Asiento(int idAsiento, int numero_asiento, Bus bus, Estado estado) {
        this.idAsiento = idAsiento;
        this.numero_asiento = numero_asiento;
        this.bus = bus;
        this.estado = estado;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
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
