package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Estado;
import pe.edu.upc.pts.repositories.EstadoRepository;
import pe.edu.upc.pts.serviceInterfaces.IEstadoService;

import java.util.List;
@Service
public class EstadoServiceImplement implements IEstadoService {
    @Autowired
    private EstadoRepository eR;

    @Override
    public List<Estado> listar_estado() {
        return eR.findAll();
    }
    @Override
    public void insert(Estado estado){
        eR.save(estado);
    }
    @Override
    public List<Estado> list() {
        return eR.findAll();
    }

}
