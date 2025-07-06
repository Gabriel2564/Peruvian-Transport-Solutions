package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Pago;
import java.util.List;

public interface IPagoService {
    List<Pago> list();
    void insert(Pago payment);
    void update(Pago payment);
    void delete(int id);
    public Pago findById(int id);
    public List<Pago> findByPaymentType(String paymentTypePago);
    public List<String[]> countPaymentsByType();
}
