package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Viaje;
import pe.edu.upc.pts.repositories.IViajeRepository;
import pe.edu.upc.pts.serviceInterfaces.IViajeService;

import java.util.List;

@Service
public class ViajeServiceImplement implements IViajeService {
    @Autowired
    private IViajeRepository rV;

    @Override
    public List<Viaje> list() {
        return rV.findAll();
    }

    @Override
    public void insert(Viaje viaje) {
        rV.save(viaje);
    }

    @Override
    public void update(Viaje viaje) { rV.save(viaje); }

    @Override
    public void delete(int id) {
        rV.deleteById(id);
    }

    @Override
    public List<String[]> QuantityViajeByRuta() {
        return rV.QuantityViajeByRuta();
    }

    @Override
    public Viaje findById(int id) {
        return rV.findByIdViaje(id)
                .orElseThrow(() -> new RuntimeException("Viaje no encontrado"));
    }

}
