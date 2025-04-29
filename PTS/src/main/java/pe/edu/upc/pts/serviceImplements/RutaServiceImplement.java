package pe.edu.upc.pts.serviceImplements;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.dtos.RutaDTO;
import pe.edu.upc.pts.entities.Item;
import pe.edu.upc.pts.entities.Ruta;
import pe.edu.upc.pts.entities.Viaje;
import pe.edu.upc.pts.repositories.IRutaRepository;
import pe.edu.upc.pts.repositories.IViajeRepository;
import pe.edu.upc.pts.serviceInterfaces.IRutaService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RutaServiceImplement implements IRutaService {
    @Autowired
    private IRutaRepository vR;

    @Override
    public List<Ruta> list() {
        return vR.findAll();
    }

    @Override
    public void insert(Ruta ruta) {
        vR.save(ruta);
    }

    @Override
    public void update(Ruta ruta) {
        vR.save(ruta);
    }

    @Override
    public void delete(int id) {
        vR.deleteById(id);
    }
//QUERY buscar RUTAPorItem
    @Override
    public List<RutaDTO> searchByItem(int itemId) {
        return vR.findByItemId(itemId)
                .stream()
                .map(ruta -> new ModelMapper().map(ruta, RutaDTO.class))
                .collect(Collectors.toList());
    }
}
