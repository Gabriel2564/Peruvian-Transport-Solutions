package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Asiento;
import pe.edu.upc.pts.repositories.IAsientoRepository;
import pe.edu.upc.pts.serviceInterfaces.IAsientoService;

import java.util.List;

@Service
public class AsientoServiceImplement implements IAsientoService {
    @Autowired
    private IAsientoRepository aR;

    @Override
    public List<Asiento> list() { return aR.findAll(); }
    @Override
    public void insert(Asiento asiento){ aR.save(asiento); }

    @Override
    public void update(Asiento asiento) { aR.save(asiento); }

    @Override
    public void delete(int id) { aR.deleteById(id); }

    @Override
    public Asiento findById(int id) {
        return aR.findByIdAsiento(id).orElseThrow(() -> new RuntimeException("Asiento no encontrado"));
    }

    @Override
    public List<String[]> contarAsientosPorBus(){
        return aR.contarAsientosPorBus();
    }

    @Override
    public List<String[]> obtenerPorcentajeEstadoPorBus(){
        return aR.obtenerPorcentajeEstadoPorBus();
    }
}
