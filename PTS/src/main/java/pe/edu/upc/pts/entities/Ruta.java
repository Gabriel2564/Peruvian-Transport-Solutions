package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Ruta")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;

    @Column(name = "lat", nullable = false, length = 100)
    private String lat;

    @Column(name = "lng", nullable = false, length = 100)
    private String lng;

    @ManyToOne
    @JoinColumn(name = "idItem")
    private Item item;

    public Ruta() {
    }

    public Ruta(int idRuta, String lat, String lng, Item item) {
        this.idRuta = idRuta;
        this.lat = lat;
        this.lng = lng;
        this.item = item;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

