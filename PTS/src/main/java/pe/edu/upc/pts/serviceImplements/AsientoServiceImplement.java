package pe.edu.upc.pts.serviceImplements;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.dtos.AsientoDTO;
import pe.edu.upc.pts.entities.Asiento;
import pe.edu.upc.pts.entities.Estado;
import pe.edu.upc.pts.repositories.IAsientoRepository;
import pe.edu.upc.pts.serviceInterfaces.IAsientoService;

import java.util.List;

@Service
public class AsientoServiceImplement implements IAsientoService {
    @Autowired
    private IAsientoRepository aR;

    @Override
    public List<Asiento> listar_asiento() {
        return aR.findAll();
    }
    @Override
    public void insert(Asiento asiento){
        aR.save(asiento);
    }
    @Override
    public void update(Asiento asiento) {aR.save(asiento);}
    @Override
    public void delete(int id) {aR.deleteById(id);}
    @Override
    public List<Asiento> search(int seat_number) {return aR.buscarPorNumeroAsiento(seat_number);}
    @Override
    public List<String[]> quantitySeatByBus() {
        return aR.quantitySeatByBus();
    }

    @Override
    public AsientoDTO buscarPorNumeroYBus(int seat_number, int busId) {
        ModelMapper modelMapper = new ModelMapper();
        Asiento asiento = aR.findByNumberAndBusId(seat_number, busId);
        return modelMapper.map(asiento, AsientoDTO.class);
    }

}
