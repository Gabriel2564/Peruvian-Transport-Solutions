package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Item_usuario;
import pe.edu.upc.pts.repositories.IItem_usuarioRepository;
import pe.edu.upc.pts.serviceInterfaces.IItem_usuarioService;

import java.util.List;
@Service
public class Item_usuarioServiceImplement implements IItem_usuarioService {
    @Autowired
    private IItem_usuarioRepository iR;
    @Override
    public List<Item_usuario> list(){
        return iR.findAll();
    }

    @Override
    public void insert(Item_usuario item_usuario) {
        iR.save(item_usuario);
    }

    @Override
    public void delete(int id_item_user){
        iR.deleteById(id_item_user);
    }

}

