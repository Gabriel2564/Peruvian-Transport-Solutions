package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Reserva_boleto;
import pe.edu.upc.pts.dtos.Reserva_boletoDTO;
import pe.edu.upc.pts.repositories.*;
import pe.edu.upc.pts.serviceInterfaces.IReserva_boletoService;

import java.util.List;

@Service
public class Reserva_boletoServiceImplement implements IReserva_boletoService {

    @Autowired
    private IReserva_boletoRepository reservationRepository;

    @Autowired
    private IUsuarioRepository userRepository;

    @Autowired
    private IPagoRepository paymentRepository;

    @Autowired
    private IAsientoRepository seatRepository;

    @Override
    public List<Reserva_boletoDTO> listarReservas() {
        return reservationRepository.findAll().stream().map(this::convertToDTO).toList();
    }

    @Override
    public Reserva_boletoDTO insertarReserva(Reserva_boletoDTO dto) {
        Reserva_boleto reservation = new Reserva_boleto();
        reservation.setTicketAmount(dto.getTicketAmount());
        reservation.setSeatQuantity(dto.getSeatQuantity());
        reservation.setUsuario(userRepository.findById(dto.getUserId()).orElse(null));
        reservation.setPago(paymentRepository.findById(dto.getPaymentId()).orElse(null));
        reservation.setAsiento(seatRepository.findById(dto.getSeatId()).orElse(null));
        return convertToDTO(reservationRepository.save(reservation));
    }

    private Reserva_boletoDTO convertToDTO(Reserva_boleto reservation) {
        Reserva_boletoDTO dto = new Reserva_boletoDTO();
        dto.setReservationId(reservation.getReservationId());
        dto.setTicketAmount(reservation.getTicketAmount());
        dto.setSeatQuantity(reservation.getSeatQuantity());
        dto.setUserId(reservation.getUsuario().getIdUsuario());
        dto.setPaymentId(reservation.getPago().getPaymentId());
        dto.setSeatId(reservation.getAsiento().getIdAsiento());
        return dto;
    }
}

