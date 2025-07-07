package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Role;
import pe.edu.upc.pts.entities.Usuarios;

import java.util.List;

public interface IUsuariosService {
    public List<Usuarios> list();
    public void insertUser (Usuarios usuarios);
    public Usuarios listId (int id);
    public void delete (int id);
    public void update (Usuarios usuarios);
    public List<String[]> QuantityUsuarioByRol();
    public Usuarios findById(int id);
}
