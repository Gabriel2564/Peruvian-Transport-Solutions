package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name="Resenia")
public class Resenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResenia;

    @Column(name="publicationDateResenia",nullable=false)
    private LocalTime publicationDateResenia;

    @Column(name = "likesResenia",nullable = false)
    private int likesResenia;

    @Column(name = "contentResenia",nullable = false,length = 1000)
    private String contentResenia;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuarios usuario;

    @ManyToOne
    @JoinColumn(name="idViaje")
    private Viaje viaje;

    public Resenia() {
    }

    public Resenia(int idResenia, LocalTime publicationDateResenia, int likesResenia, String contentResenia, Usuarios usuario, Viaje viaje) {
        this.idResenia = idResenia;
        this.publicationDateResenia = publicationDateResenia;
        this.likesResenia = likesResenia;
        this.contentResenia = contentResenia;
        this.usuario = usuario;
        this.viaje = viaje;
    }

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
