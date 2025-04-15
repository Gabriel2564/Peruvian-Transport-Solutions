package pe.edu.upc.pts.dtos;

import java.time.LocalTime;

public class ReseniaDTO {
    private int id_Resenia;
    private LocalTime fecha_publicada;
    private int likes;
    private String contenido;

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
}
