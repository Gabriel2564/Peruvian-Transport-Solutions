package pe.edu.upc.pts.dtos;
import pe.edu.upc.pts.entities.Item;

public class RutaDTO {
    private int idRuta;
    private String location;
    private String start_longitude;
    private String destination_longitude;
    private String start_latitude;
    private String destination_latitude;

    private Item item;

    public int getIdRuta() {return idRuta;}

    public void setIdRuta(int idRuta) {this.idRuta = idRuta;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public String getStart_longitude() {return start_longitude;}

    public void setStart_longitude(String start_longitude) {this.start_longitude = start_longitude;}

    public String getDestination_longitude() {return destination_longitude;}

    public void setDestination_longitude(String destination_longitude) {this.destination_longitude = destination_longitude;}

    public String getStart_latitude() {return start_latitude;}

    public void setStart_latitude(String start_latitude) {this.start_latitude = start_latitude;}

    public String getDestination_latitude() {return destination_latitude;}

    public void setDestination_latitude(String destination_latitude) {this.destination_latitude = destination_latitude;}

    public Item getItem() {return item;}

    public void setItem(Item item) {this.item = item;}
}
