package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario usuario);
    public void update(Usuario usuario);
    public void delete(int id_usuario);
}
