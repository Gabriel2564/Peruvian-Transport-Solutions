package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Ruta")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;
    @Column(name = "location", nullable = false, length = 100)
    private String location;
    @Column(name = "start_longitude", nullable = false, length = 100)
    private String start_longitude;
    @Column(name = "destination_longitude", nullable = false, length = 100)
    private String destination_longitude;
    @Column(name = "start_latitude", nullable = false, length = 100)
    private String start_latitude;
    @Column(name = "destination_latitude", nullable = false, length = 100)
    private String destination_latitude;

    @ManyToOne
    @JoinColumn(name = "idItem")
    private Item item;

    public Ruta() {
    }

    public Ruta(int idRuta, String location, String start_longitude, String destination_longitude, String start_latitude, String destination_latitude, Item item) {
        this.idRuta = idRuta;
        this.location = location;
        this.start_longitude = start_longitude;
        this.destination_longitude = destination_longitude;
        this.start_latitude = start_latitude;
        this.destination_latitude = destination_latitude;
        this.item = item;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStart_longitude() {
        return start_longitude;
    }

    public void setStart_longitude(String start_longitude) {
        this.start_longitude = start_longitude;
    }

    public String getDestination_longitude() {
        return destination_longitude;
    }

    public void setDestination_longitude(String destination_longitude) {
        this.destination_longitude = destination_longitude;
    }

    public String getStart_latitude() {
        return start_latitude;
    }

    public void setStart_latitude(String start_latitude) {
        this.start_latitude = start_latitude;
    }

    public String getDestination_latitude() {
        return destination_latitude;
    }

    public void setDestination_latitude(String destination_latitude) {
        this.destination_latitude = destination_latitude;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

