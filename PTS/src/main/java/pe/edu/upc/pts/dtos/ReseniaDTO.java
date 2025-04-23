package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Usuario;

import java.time.LocalTime;

public class ReseniaDTO {
    private int id_Resenia;
    private LocalTime fecha_publicada;
    private int likes;
    private String contenido;
    private Usuario usuario;
    private Viaje viaje;

    public int getId_Resenia() {
        return id_Resenia;
    }

    public void setId_Resenia(int id_Resenia) {
        this.id_Resenia = id_Resenia;
    }

    public LocalTime getFecha_publicada() {
        return fecha_publicada;
    }

    public void setFecha_publicada(LocalTime fecha_publicada) {
        this.fecha_publicada = fecha_publicada;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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
