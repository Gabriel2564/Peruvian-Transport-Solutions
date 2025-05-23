package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Reserva_boleto;
import pe.edu.upc.pts.repositories.IReserva_boletoRepository;
import pe.edu.upc.pts.serviceInterfaces.IReserva_boletoService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class Reserva_boletoServiceImplement implements IReserva_boletoService {

    @Autowired
    private IReserva_boletoRepository reservaRepo;

    @Override
    public List<Reserva_boleto> list() {
        return reservaRepo.findAll();
    }

    @Override
    public void insert(Reserva_boleto reserva) {
        reservaRepo.save(reserva);
    }

    @Override
    public void update(Reserva_boleto reserva) {
        reservaRepo.save(reserva);
    }

    @Override
    public void delete(int id) {
        reservaRepo.deleteById(id);
    }

    @Override
    public Reserva_boleto findById(int id) {
        return reservaRepo.findByIdReservaBoleto(id).orElseThrow(() -> new RuntimeException("Reserva de Boleto no encontrado"));
    }

    @Override
    public List<Reserva_boleto> findByTicketAmountGreaterThan(BigDecimal amount) {
        return reservaRepo.findByTicketAmountGreaterThan(amount);
    }

}
