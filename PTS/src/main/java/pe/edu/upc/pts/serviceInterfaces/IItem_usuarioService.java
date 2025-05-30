package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Item_usuario;

import java.util.List;

public interface IItem_usuarioService {
    public List<Item_usuario> list();
    public void insert( Item_usuario item_usuario);
    public void update( Item_usuario item_usuario);
    public void delete(int id_item_user);
    public List<String[]> ObtenerTopCalificados();
    public Item_usuario findById(int id);

}
