package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Role;
import pe.edu.upc.pts.repositories.IRolRepository;
import pe.edu.upc.pts.serviceInterfaces.IRolesService;

import java.util.List;

@Service
public class RolesServiceImplement implements IRolesService {

    @Autowired
    private IRolRepository rR;

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void insertRoles(Role role) {
        rR.save(role);
    }

    @Override
    public Role listId(Long id) {
        return rR. findById(id).orElse(new Role());
    }

    @Override
    public void delete(Long id) {
        rR.deleteById(id);
    }

    @Override
    public void update(Role role) {
        rR.save(role);
    }

    @Override
    public List<String[]> quantityUserByRol() {
        return rR.quantityUserByRol();
    }

    @Override
    public Role findById(Long id) {
        return rR.findRolById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
    }
}
