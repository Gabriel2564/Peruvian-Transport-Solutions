package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Estado;
import pe.edu.upc.pts.repositories.IEstadoRepository;
import pe.edu.upc.pts.serviceInterfaces.IEstadoService;

import java.util.List;
@Service
public class EstadoServiceImplement implements IEstadoService {
    @Autowired
    private IEstadoRepository eR;

    @Override
    public List<Estado> list() {
        return eR.findAll();
    }

    @Override
    public void insert(Estado estado){
        eR.save(estado);
    }

    @Override
    public void update(Estado estado) {
        eR.save(estado);
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Estado findById(int id) {
        return eR.findByIdEstado(id).orElseThrow(() -> new RuntimeException("Estado no encontrado"));
    }

}
