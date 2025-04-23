package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;

    @Column(name = "state_name", nullable = false, length = 100)
    private String state_name;

    @Column(name = "state_type", nullable = false, length = 100)
    private String state_type;

    public Estado() {
    }

    public Estado(int idEstado, String state_name, String state_type) {
        this.idEstado = idEstado;
        this.state_name = state_name;
        this.state_type = state_type;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getState_type() {
        return state_type;
    }

    public void setState_type(String state_type) {
        this.state_type = state_type;
    }
}


