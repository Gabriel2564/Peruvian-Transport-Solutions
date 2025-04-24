package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Ruta")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;

    @Column(name = "locationRuta", nullable = false, length = 100)
    private String locationRuta;

    @Column(name = "initialLengthRuta", nullable = false, length = 100)
    private String initialLengthRuta;

    @Column(name = "finalLengthRuta", nullable = false, length = 100)
    private String finalLengthRuta;

    @Column(name = "initialLatitudeRuta", nullable = false, length = 100)
    private String initialLatitudeRuta;

    @Column(name = "finalLatitudeRuta", nullable = false, length = 100)
    private String finalLatitudeRuta;

    @ManyToOne
    @JoinColumn(name = "idItem")
    private Item item;

    public Ruta() {
    }

    public Ruta(int idRuta, String locationRuta, String initialLengthRuta, String finalLengthRuta, String initialLatitudeRuta, String finalLatitudeRuta, Item item) {
        this.idRuta = idRuta;
        this.locationRuta = locationRuta;
        this.initialLengthRuta = initialLengthRuta;
        this.finalLengthRuta = finalLengthRuta;
        this.initialLatitudeRuta = initialLatitudeRuta;
        this.finalLatitudeRuta = finalLatitudeRuta;
        this.item = item;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getLocationRuta() {
        return locationRuta;
    }

    public void setLocationRuta(String locationRuta) {
        this.locationRuta = locationRuta;
    }

    public String getInitialLengthRuta() {
        return initialLengthRuta;
    }

    public void setInitialLengthRuta(String initialLengthRuta) {
        this.initialLengthRuta = initialLengthRuta;
    }

    public String getFinalLengthRuta() {
        return finalLengthRuta;
    }

    public void setFinalLengthRuta(String finalLengthRuta) {
        this.finalLengthRuta = finalLengthRuta;
    }

    public String getInitialLatitudeRuta() {
        return initialLatitudeRuta;
    }

    public void setInitialLatitudeRuta(String initialLatitudeRuta) {
        this.initialLatitudeRuta = initialLatitudeRuta;
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
