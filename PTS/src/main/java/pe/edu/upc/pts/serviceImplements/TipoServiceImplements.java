package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Tipo;
import pe.edu.upc.pts.repositories.ITipoRepository;
import pe.edu.upc.pts.serviceInterfaces.ITipoService;

import java.util.List;

@Service
public class TipoServiceImplements implements ITipoService {
    @Autowired
    private ITipoRepository tR;
    @Override
    public List<Tipo> list(){
        return tR.findAll();
    }

    @Override
    public void insert(Tipo tipo) {

    }

}
