package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Ruta")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;
    @Column(name = "ubicacion", nullable = false, length = 100)
    private String ubicacion;
    @Column(name = "longitud_inicio", nullable = false, length = 100)
    private String longitud_inicio;
    @Column(name = "longitud_destino", nullable = false, length = 100)
    private String longitud_destino;
    @Column(name = "latitud_inicio", nullable = false, length = 100)
    private String latitud_inicio;
    @Column(name = "latitud_destino", nullable = false, length = 100)
    private String latitud_destino;

    @ManyToOne
    @JoinColumn(name = "idItem")
    private  Item item;

    public Ruta() {
    }

    public Ruta(int idRuta, String ubicacion, String longitud_inicio, String longitud_destino, String latitud_inicio, String latitud_destino, Item item) {
        this.idRuta = idRuta;
        this.ubicacion = ubicacion;
        this.longitud_inicio = longitud_inicio;
        this.longitud_destino = longitud_destino;
        this.latitud_inicio = latitud_inicio;
        this.latitud_destino = latitud_destino;
        this.item = item;
    }

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
