package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name = "nameRol", nullable = false, length = 10)
    private String nameRol;

    public Rol() {
    }

    public Rol(Long idRol, String nameRol) {
        this.idRol = idRol;
        this.nameRol = nameRol;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }
}
