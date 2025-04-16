package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Pago;
import pe.edu.upc.pts.repositories.IPagoRepository;
import pe.edu.upc.pts.serviceInterfaces.IPagoService;

import java.util.List;

@Service
public class PagoServiceImplement implements IPagoService {

    @Autowired
    private IPagoRepository pR;

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Pago p) {
        pR.save(p);
    }

    @Override
    public void update(Pago p) {
        pR.save(p);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
}
