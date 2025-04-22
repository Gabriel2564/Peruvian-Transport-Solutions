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
    public void insert(Viaje viaje) {
        rV.save(viaje);
    }

    @Override
    public List<Viaje> list() {
        return rV.findAll();
    }

    @Override
    public void delete(int idViaje) {
        rV.deleteById(idViaje);
    }

}
