package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Rol;

import java.util.List;

public class UsuarioDTO {
    private Long idUsuario;
    private String usernameUsuario;
    private String passwordUsuario;
    private Boolean enableUsuario;
    private List<Rol> rol;

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
