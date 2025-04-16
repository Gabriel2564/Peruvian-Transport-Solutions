package pe.edu.upc.pts.entities;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.processing.Generated;
import java.time.LocalTime;

@Entity
@Table(name="Item_usuario")
public class Item_usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_item_usuario;
    @Column(name = "calificacion_viaj",nullable = false,length =100 )
    private String calificacion_viaj;
    @Column(name = "fecha_viaje_fav",nullable = false)
    private LocalTime fecha_viaje_fav;
    public Item_usuario() {

    }

    public Item_usuario(int id_item_usuario, String calificacion_viaj, LocalTime fecha_viaje_fav) {
        this.id_item_usuario = id_item_usuario;
        this.calificacion_viaj = calificacion_viaj;
        this.fecha_viaje_fav = fecha_viaje_fav;
    }

    public int getId_item_usuario() {
        return id_item_usuario;
    }

    public void setId_item_usuario(int id_item_usuario) {
        this.id_item_usuario = id_item_usuario;
    }

    public String getCalificacion_viaj() {
        return calificacion_viaj;
    }

    public void setCalificacion_viaj(String calificacion_viaj) {
        this.calificacion_viaj = calificacion_viaj;
    }

    public LocalTime getFecha_viaje_fav() {
        return fecha_viaje_fav;
    }

    public void setFecha_viaje_fav(LocalTime fecha_viaje_fav) {
        this.fecha_viaje_fav = fecha_viaje_fav;
    }
}
