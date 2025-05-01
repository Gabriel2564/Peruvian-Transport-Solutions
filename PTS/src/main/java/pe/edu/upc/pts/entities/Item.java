package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItem;

    @Column(name = "titleItem", nullable = false, length = 50)
    private String titleItem;

    @Column(name = "descriptionItem", nullable = false, length = 1000)
    private String descriptionItem;

    @Column(name = "imageItem", nullable = false, length = 500)
    private String imageItem;

    @Column(name = "formatItem", nullable = false, length = 10)
    private String formatItem;

    public Item() {
    }

    public Item(int idItem, String titleItem, String descriptionItem, String imageItem, String formatItem) {
        this.idItem = idItem;
        this.titleItem = titleItem;
        this.descriptionItem = descriptionItem;
        this.imageItem = imageItem;
        this.formatItem = formatItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getTitleItem() {
        return titleItem;
    }

    public void setTitleItem(String titleItem) {
        this.titleItem = titleItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }

    public String getImageItem() {
        return imageItem;
    }

    public void setImageItem(String imageItem) {
        this.imageItem = imageItem;
    }

    public String getFormatItem() {
        return formatItem;
    }

    public void setFormatItem(String formatItem) {
        this.formatItem = formatItem;
    }
}
