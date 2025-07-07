package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Role;

import java.util.List;

public interface IRolesService {
    public List<Role> list();
    public void insertRoles (Role role);
    public Role listId (Long id);
    public void delete (Long id);
    public void update (Role role);
    List<String[]> quantityUserByRol();
    public Role findById(Long id);
}
