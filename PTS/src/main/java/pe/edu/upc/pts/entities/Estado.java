package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;

    @Column(name = "n_estado", nullable = false, length = 100)
    private String n_estado;

    @Column(name = "tipo_estado", nullable = false, length = 100)
    private String tipo_estado;

    public Estado() {
    }

    public Estado(int idEstado, String n_estado, String tipo_estado) {
        this.idEstado = idEstado;
        this.n_estado = n_estado;
        this.tipo_estado = tipo_estado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getN_estado() {
        return n_estado;
    }

    public void setN_estado(String n_estado) {
        this.n_estado = n_estado;
    }

    public String getTipo_estado() {
        return tipo_estado;
    }

    public void setTipo_estado(String tipo_estado) {
        this.tipo_estado = tipo_estado;
    }
}


