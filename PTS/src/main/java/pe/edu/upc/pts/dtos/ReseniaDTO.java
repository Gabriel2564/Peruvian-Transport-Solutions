package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Usuarios;
import pe.edu.upc.pts.entities.Viaje;

import java.time.LocalTime;

public class ReseniaDTO {
    private int idResenia;
    private LocalTime publicationDateResenia;
    private int likesResenia;
    private String contentResenia;
    private Usuarios usuario;
    private Viaje viaje;

    public int getIdResenia() {
        return idResenia;
    }

    public void setIdResenia(int idResenia) {
        this.idResenia = idResenia;
    }

    public LocalTime getPublicationDateResenia() {
        return publicationDateResenia;
    }

    public void setPublicationDateResenia(LocalTime publicationDateResenia) {
        this.publicationDateResenia = publicationDateResenia;
    }

    public int getLikesResenia() {
        return likesResenia;
    }

    public void setLikesResenia(int likesResenia) {
        this.likesResenia = likesResenia;
    }

    public String getContentResenia() {
        return contentResenia;
    }

    public void setContentResenia(String contentResenia) {
        this.contentResenia = contentResenia;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
}
