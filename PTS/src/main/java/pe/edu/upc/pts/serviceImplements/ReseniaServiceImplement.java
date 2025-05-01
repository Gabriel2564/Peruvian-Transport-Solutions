package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Resenia;
import pe.edu.upc.pts.repositories.IReseniaRepository;
import pe.edu.upc.pts.serviceInterfaces.IReseniaService;

import java.util.List;

@Service
public class ReseniaServiceImplement implements IReseniaService {
    @Autowired
    private IReseniaRepository rR;

    @Override
    public List<Resenia> list() {return rR.findAll();}

    @Override
    public void insert(Resenia resenia) { rR.save(resenia);}

    @Override
    public void update(Resenia resenia) { rR.save(resenia);}

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public List<String[]> QuantityReseniaByUsuario() {
        return rR.QuantityReseniaByUsername();
    }

}
