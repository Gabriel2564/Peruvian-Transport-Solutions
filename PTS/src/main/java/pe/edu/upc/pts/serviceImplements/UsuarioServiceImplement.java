package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Usuario;
import pe.edu.upc.pts.repositories.IUsuarioRepository;
import pe.edu.upc.pts.serviceInterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Usuario> list(){
        return uR.findAll();
    }

    @Override
    public void insert(Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword())); // ← ESTA LÍNEA ES CLAVE
        uR.save(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public List<String[]> QuantityUsuarioByRol() {
        return uR.QuantityUsuarioByRol();
    }

    @Override
    public Usuario findById(int id) {
        return uR.findUsuarioById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

}
