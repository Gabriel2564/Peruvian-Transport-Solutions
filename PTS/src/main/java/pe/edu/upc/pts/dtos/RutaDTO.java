package pe.edu.upc.pts.dtos;
import pe.edu.upc.pts.entities.Item;

public class RutaDTO {
    private int idRuta;
    private String startLocationRuta;
    private String finalLocationRuta;
    private String startLongitudeRuta;
    private String finalLongitudeRuta;
    private String startLatitudeRuta;
    private String finalLatitudeRuta;
    private Item item;

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
