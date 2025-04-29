package pe.edu.upc.pts.dtos;

import jakarta.persistence.Column;

import java.time.LocalTime;

public class Item_usuarioDTO {
    private int id_item_user;
    private String calificacion_viaj;
    private LocalTime fecha_viaje_fav;

    public int getId_item_user() {
        return id_item_user;
    }

    public void setId_item_user(int id_item_user) {
        this.id_item_user = id_item_user;
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
