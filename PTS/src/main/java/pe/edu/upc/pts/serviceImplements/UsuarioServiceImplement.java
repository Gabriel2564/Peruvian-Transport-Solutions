package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Usuario;
import pe.edu.upc.pts.repositories.IUsuarioRepository;
import pe.edu.upc.pts.serviceInterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public List<Usuario> list(){
        return uR.findAll();
    }

    @Override
    public void insert(Usuario usuario) {
      uR.save(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public void delete(int id_usuario) {
        uR.deleteById(id_usuario);
    }

    @Override
    public List<String[]> QuantityUsuarioByRol() {
        return uR.QuantityUsuarioByRol();
    }

}
