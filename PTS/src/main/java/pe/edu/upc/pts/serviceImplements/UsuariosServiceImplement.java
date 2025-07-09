package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Usuarios;
import pe.edu.upc.pts.repositories.IUsuariosRepository;
import pe.edu.upc.pts.serviceInterfaces.IUsuariosService;

import java.util.List;

@Service
public class UsuariosServiceImplement implements IUsuariosService {

    @Autowired
    private IUsuariosRepository uR;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Usuarios> list() {
        return uR.findAll();
    }

    @Override
    public void insertUser(Usuarios usuarios) {
        usuarios.setPassword(passwordEncoder.encode(usuarios.getPassword()));
        uR.save(usuarios);
    }


    @Override
    public Usuarios listId(int id) {
        return uR. findById(id).orElse(new Usuarios());
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public void update(Usuarios usuarios) {
        Usuarios usuarioExistente = uR.findById(usuarios.getIdUsuario())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuarioExistente.setUsNombre(usuarios.getUsNombre());
        usuarioExistente.setUsApellido(usuarios.getUsApellido());
        usuarioExistente.setUsFecNacimiento(usuarios.getUsFecNacimiento());
        usuarioExistente.setUsCorreo(usuarios.getUsCorreo());
        usuarioExistente.setUsername(usuarios.getUsername());
        usuarioExistente.setUsEnable(usuarios.getUsEnable());
        usuarioExistente.setRole(usuarios.getRole());

        uR.save(usuarioExistente);
    }

    @Override
    public Usuarios findById(int id) {
        return uR.findUsuarioById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }


}
