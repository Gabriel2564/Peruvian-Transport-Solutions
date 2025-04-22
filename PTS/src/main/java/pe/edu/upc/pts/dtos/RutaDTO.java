package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Item;

public class RutaDTO {
    private int idRuta;
    private String ubicacion;
    private String longitud_inicio;
    private String longitud_destino;
    private String latitud_inicio;
    private String latitud_destino;

    private Item item;

    public int getIdRuta() {return idRuta;}

    public void setIdRuta(int idRuta) {this.idRuta = idRuta;}

    public String getUbicacion() {return ubicacion;}

    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}

    public String getLongitud_inicio() {return longitud_inicio;}

    public void setLongitud_inicio(String longitud_inicio) {this.longitud_inicio = longitud_inicio;}

    public String getLongitud_destino() {return longitud_destino;}

    public void setLongitud_destino(String longitud_destino) {this.longitud_destino = longitud_destino;}

    public String getLatitud_inicio() {return latitud_inicio;}

    public void setLatitud_inicio(String latitud_inicio) {this.latitud_inicio = latitud_inicio;}

    public String getLatitud_destino() {return latitud_destino;}

    public void setLatitud_destino(String latitud_destino) {this.latitud_destino = latitud_destino;}

    public Item getItem() {return item;}

    public void setItem(Item item) {this.item = item;}
}
