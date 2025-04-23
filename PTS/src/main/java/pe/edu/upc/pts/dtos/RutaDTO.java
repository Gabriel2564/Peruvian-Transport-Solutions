package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Item;

public class RutaDTO {
    private int idRuta;
    private String locationRuta;
    private String initialLengthRuta;
    private String finalLengthRuta;
    private String initialLatitudeRuta;
    private String finalLatitudeRuta;
    private Item item;

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
