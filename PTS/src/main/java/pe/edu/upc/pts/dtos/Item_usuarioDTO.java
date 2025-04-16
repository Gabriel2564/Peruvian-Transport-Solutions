package pe.edu.upc.pts.dtos;

import java.time.LocalTime;

public class Item_usuarioDTO {
    private int id_item_usuario;
    private String calificacion_viaj;
    private LocalTime fecha_viaje_fav;

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
