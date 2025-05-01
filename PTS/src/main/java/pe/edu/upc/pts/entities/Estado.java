package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;

    @Column(name = "statusTypeEstado", nullable = false, length = 20)
    private String statusTypeEstado;

    public Estado() {
    }

    public Estado(int idEstado, String statusTypeEstado) {
        this.idEstado = idEstado;
        this.statusTypeEstado = statusTypeEstado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getStatusTypeEstado() {
        return statusTypeEstado;
    }

    public void setStatusTypeEstado(String statusTypeEstado) {
        this.statusTypeEstado = statusTypeEstado;
    }
}


