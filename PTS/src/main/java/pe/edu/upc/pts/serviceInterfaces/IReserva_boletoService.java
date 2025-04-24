package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.dtos.Reserva_boletoDTO;
import java.util.List;

public interface IReserva_boletoService {
    List<Reserva_boletoDTO> listReservations();
    Reserva_boletoDTO insertReservation(Reserva_boletoDTO dto);
}
