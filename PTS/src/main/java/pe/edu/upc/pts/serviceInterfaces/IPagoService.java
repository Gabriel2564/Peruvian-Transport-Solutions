package pe.edu.upc.pts.serviceInterfaces;
import pe.edu.upc.pts.entities.Pago;
import java.util.List;

public interface IPagoService {
    List<Pago> list();
    void insert(Pago pago);
    void update(Pago pago);
    void delete(int id);
}

