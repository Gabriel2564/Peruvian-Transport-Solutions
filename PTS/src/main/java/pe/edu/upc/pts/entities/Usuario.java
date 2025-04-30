package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "usernameUsuario",nullable = false,length = 30)
    private String usernameUsuario;

    @Column(name = "passwordUsuario",nullable = false,length = 200)
    private String passwordUsuario;

    @Column(name = "enableUsuario",nullable = false)
    private Boolean enableUsuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idRol")
    private List<Rol> rol;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String usernameUsuario, String passwordUsuario, Boolean enableUsuario, List<Rol> rol) {
        this.idUsuario = idUsuario;
        this.usernameUsuario = usernameUsuario;
        this.passwordUsuario = passwordUsuario;
        this.enableUsuario = enableUsuario;
        this.rol = rol;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsernameUsuario() {
        return usernameUsuario;
    }

    public void setUsernameUsuario(String usernameUsuario) {
        this.usernameUsuario = usernameUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public Boolean getEnableUsuario() {
        return enableUsuario;
    }

    public void setEnableUsuario(Boolean enableUsuario) {
        this.enableUsuario = enableUsuario;
    }

    public List<Rol> getRol() {
        return rol;
    }

    public void setRol(List<Rol> rol) {
        this.rol = rol;
    }
}
