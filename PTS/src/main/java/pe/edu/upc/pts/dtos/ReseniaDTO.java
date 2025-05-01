package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Usuario;
import pe.edu.upc.pts.entities.Viaje;

import java.time.LocalTime;

public class ReseniaDTO {
    private int idResenia;
    private LocalTime publicationDateResenia;
    private int likesResenia;
    private String contentResenia;
    private Usuario usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
}
