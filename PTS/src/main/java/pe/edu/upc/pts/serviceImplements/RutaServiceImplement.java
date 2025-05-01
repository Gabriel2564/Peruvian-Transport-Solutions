package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Ruta;
import pe.edu.upc.pts.repositories.IRutaRepository;
import pe.edu.upc.pts.serviceInterfaces.IRutaService;

import java.util.List;

@Service
public class RutaServiceImplement implements IRutaService {
    @Autowired
    private IRutaRepository rR;

    @Override
    public List<Ruta> list() { return rR.findAll(); }

    @Override
    public void insert(Ruta ruta) { rR.save(ruta); }

    @Override
    public void update(Ruta ruta) { rR.save(ruta); }

    @Override
    public void delete(int id) { rR.deleteById(id); }
}
