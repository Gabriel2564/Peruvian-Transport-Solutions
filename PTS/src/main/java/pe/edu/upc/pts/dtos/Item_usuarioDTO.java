package pe.edu.upc.pts.dtos;

import java.time.LocalTime;

public class Item_usuarioDTO {
    private int id_item_user;
    private int qualification_viaj;
    private LocalTime date_viaje_fav;

    public int getId_item_user() {
        return id_item_user;
    }

    public void setId_item_user(int id_item_user) {
        this.id_item_user = id_item_user;
    }

    public int getQualification_viaj() {
        return qualification_viaj;
    }

    public void setQualification_viaj(int qualification_viaj) {
        this.qualification_viaj = qualification_viaj;
    }

    public LocalTime getDate_viaje_fav() {
        return date_viaje_fav;
    }

    public void setDate_viaje_fav(LocalTime date_viaje_fav) {
        this.date_viaje_fav = date_viaje_fav;
    }
}
