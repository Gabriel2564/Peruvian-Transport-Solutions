package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name="Resenia")
public class Resenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Resenia;
    @Column(name="fecha_publicada",nullable=false)
    private LocalTime fecha_publicada;
    @Column(name = "likes",nullable = false)
    private int likes;
    @Column(name = "contenido",nullable = false,length = 1000)
    private String contenido;
    @ManyToOne
    @JoinColumn(name="usuario_id_usua")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name="viaje_id_viaje")
    private Viaje viaje;

    public Resenia(int id_Reseña, LocalTime fecha_publicada, int likes, String contenido) {
        this.id_Resenia = id_Resenia;
        this.fecha_publicada = fecha_publicada;
        this.likes = likes;
        this.contenido = contenido;
    }

    public Resenia() {

    }

    public int getId_Resenia() {
        return id_Resenia;
    }

    public void setId_Reseani(int id_Reseña) {
        this.id_Resenia = id_Reseña;
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
