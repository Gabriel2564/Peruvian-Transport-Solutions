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
    private IPagoRepository paymentRepository;

    @Override
    public List<Pago> list() {
        return paymentRepository.findAll();
    }

    @Override
    public void insert(Pago payment) {
        paymentRepository.save(payment);
    }

    @Override
    public void update(Pago payment) {
        paymentRepository.save(payment);
    }

    @Override
    public void delete(int id) {
        paymentRepository.deleteById(id);
    }

    @Override
    public List<Pago> findByPaymentType(String paymentTypePago) {
        return paymentRepository.findByPaymentType(paymentTypePago);
    }

    @Override
    public List<Object[]> countPaymentsByType() {
        return paymentRepository.countPaymentsByType();
    }

    @Override
    public Pago findById(int id) {
        return paymentRepository.findByIdPago(id).orElseThrow(() -> new RuntimeException("Pago no encontrado"));
    }
}
