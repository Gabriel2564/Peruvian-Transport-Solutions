package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Item;
import pe.edu.upc.pts.entities.Usuario;

import java.time.LocalDate;

public class Item_usuarioDTO {
    private int idItemUsuario;
    private int travelQualificationItemUsuario;
    private LocalDate travelDateItemUsuario;
    private Item item;
    private Usuario usuario;

    public int getIdItemUsuario() {
        return idItemUsuario;
    }

    public void setIdItemUsuario(int idItemUsuario) {
        this.idItemUsuario = idItemUsuario;
    }

    public int getTravelQualificationItemUsuario() {
        return travelQualificationItemUsuario;
    }

    public void setTravelQualificationItemUsuario(int travelQualificationItemUsuario) {
        this.travelQualificationItemUsuario = travelQualificationItemUsuario;
    }

    public LocalDate getTravelDateItemUsuario() {
        return travelDateItemUsuario;
    }

    public void setTravelDateItemUsuario(LocalDate travelDateItemUsuario) {
        this.travelDateItemUsuario = travelDateItemUsuario;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
