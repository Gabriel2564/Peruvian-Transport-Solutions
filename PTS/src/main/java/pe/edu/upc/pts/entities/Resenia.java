package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name="Resenia")
public class Resenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Resenia;
    @Column(name="date_publication",nullable=false)
    private LocalTime date_publication;
    @Column(name = "likes",nullable = false)
    private int likes;
    @Column(name = "content",nullable = false,length = 1000)
    private String content;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name="id_viaje")
    private Viaje viaje;
    public Resenia() {}

    public Resenia(int id_Resenia, LocalTime date_publication, int likes, String content) {
        this.id_Resenia = id_Resenia;
        this.date_publication = date_publication;
        this.likes = likes;
        this.content = content;
    }

    public int getId_Resenia() {
        return id_Resenia;
    }

    public void setId_Resenia(int id_Resenia) {
        this.id_Resenia = id_Resenia;
    }

    public LocalTime getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(LocalTime date_publication) {
        this.date_publication = date_publication;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
