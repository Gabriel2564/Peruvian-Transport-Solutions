package pe.edu.upc.peruviantransportsolutions.servicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.peruviantransportsolutions.entities.Estado;
import pe.edu.upc.peruviantransportsolutions.repositories.EstadoRepository;
import pe.edu.upc.peruviantransportsolutions.servicesInterfaces.IEstadoService;

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
    public List<Estado> list() {
        return eR.findAll();
    }

}
