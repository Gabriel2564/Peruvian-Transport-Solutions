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
    private int id_item_user;
    @Column(name = "qualification_viaj",nullable = false,length =100 )
    private String qualification_viaj;
    @Column(name = "date_viaje_fav",nullable = false)
    private LocalTime date_viaje_fav;
    public Item_usuario() {

    }

    public Item_usuario(int id_item_user, String qualification_viaj, LocalTime date_viaje_fav) {
        this.id_item_user = id_item_user;
        this.qualification_viaj = qualification_viaj;
        this.date_viaje_fav = date_viaje_fav;
    }

    public int getId_item_user() {
        return id_item_user;
    }

    public void setId_item_user(int id_item_user) {
        this.id_item_user = id_item_user;
    }

    public String getQualification_viaj() {
        return qualification_viaj;
    }

    public void setQualification_viaj(String qualification_viaj) {
        this.qualification_viaj = qualification_viaj;
    }

    public LocalTime getDate_viaje_fav() {
        return date_viaje_fav;
    }

    public void setDate_viaje_fav(LocalTime date_viaje_fav) {
        this.date_viaje_fav = date_viaje_fav;
    }
}
