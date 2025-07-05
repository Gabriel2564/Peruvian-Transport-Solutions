package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Bus;
import pe.edu.upc.pts.repositories.IBusRepository;
import pe.edu.upc.pts.serviceInterfaces.IBusService;

import java.time.LocalDate;
import java.util.List;

@Service
public class BusServiceImplement implements IBusService {
    @Autowired
    private IBusRepository bR;

    @Override
    public List<Bus> list(){
        return bR.findAll();
    }

    @Override
    public void insert(Bus bus){
        bR.save(bus);
    }

    @Override
    public void update(Bus bus){
        bR.save(bus);
    }

    @Override
    public void delete(int id){
        bR.deleteById(id);
    }

    @Override
    public Bus findById(int id) {
        return bR.findByIdBus(id).orElseThrow(() -> new RuntimeException("Bus no encontrado"));
    }
}
