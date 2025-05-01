package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Ruta")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;

    @Column(name = "startLocationRuta", nullable = false, length = 100)
    private String startLocationRuta;

    @Column(name = "finalLocationRuta", nullable = false, length = 100)
    private String finalLocationRuta;

    @Column(name = "startLongitudeRuta", nullable = false, length = 100)
    private String startLongitudeRuta;

    @Column(name = "finalLongitudeRuta", nullable = false, length = 100)
    private String finalLongitudeRuta;

    @Column(name = "startLatitudeRuta", nullable = false, length = 100)
    private String startLatitudeRuta;

    @Column(name = "finalLatitudeRuta", nullable = false, length = 100)
    private String finalLatitudeRuta;

    @ManyToOne
    @JoinColumn(name = "idItem")
    private Item item;

    public Ruta() {
    }

    public Ruta(int idRuta, String startLocationRuta, String finalLocationRuta, String startLongitudeRuta, String finalLongitudeRuta, String startLatitudeRuta, String finalLatitudeRuta, Item item) {
        this.idRuta = idRuta;
        this.startLocationRuta = startLocationRuta;
        this.finalLocationRuta = finalLocationRuta;
        this.startLongitudeRuta = startLongitudeRuta;
        this.finalLongitudeRuta = finalLongitudeRuta;
        this.startLatitudeRuta = startLatitudeRuta;
        this.finalLatitudeRuta = finalLatitudeRuta;
        this.item = item;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getStartLocationRuta() {
        return startLocationRuta;
    }

    public void setStartLocationRuta(String startLocationRuta) {
        this.startLocationRuta = startLocationRuta;
    }

    public String getFinalLocationRuta() {
        return finalLocationRuta;
    }

    public void setFinalLocationRuta(String finalLocationRuta) {
        this.finalLocationRuta = finalLocationRuta;
    }

    public String getStartLongitudeRuta() {
        return startLongitudeRuta;
    }

    public void setStartLongitudeRuta(String startLongitudeRuta) {
        this.startLongitudeRuta = startLongitudeRuta;
    }

    public String getFinalLongitudeRuta() {
        return finalLongitudeRuta;
    }

    public void setFinalLongitudeRuta(String finalLongitudeRuta) {
        this.finalLongitudeRuta = finalLongitudeRuta;
    }

    public String getStartLatitudeRuta() {
        return startLatitudeRuta;
    }

    public void setStartLatitudeRuta(String startLatitudeRuta) {
        this.startLatitudeRuta = startLatitudeRuta;
    }

    public String getFinalLatitudeRuta() {
        return finalLatitudeRuta;
    }

    public void setFinalLatitudeRuta(String finalLatitudeRuta) {
        this.finalLatitudeRuta = finalLatitudeRuta;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

