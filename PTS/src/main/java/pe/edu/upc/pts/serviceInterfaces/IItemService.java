package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Item;

import java.util.List;

public interface IItemService {
    public List<Item> list();
    public void insert(Item item);
    public void update(Item item);
    public void delete(int id);
    public List<Item> ItemByFormato(String formato);
    public Item findById(int id);
}
