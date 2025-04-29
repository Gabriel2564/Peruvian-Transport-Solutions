package pe.edu.upc.pts.dtos;

public class ItemDTO {
    private int idItem;
    private String numItem;
    private String descriptionItem;
    private String imageItem;
    private String formatItem;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNumItem() {
        return numItem;
    }

    public void setNumItem(String numItem) {
        this.numItem = numItem;
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
