package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.dtos.Reserva_boletoDTO;
import java.util.List;

public interface IReserva_boletoService {
    List<Reserva_boletoDTO> listarReservas();
    Reserva_boletoDTO insertarReserva(Reserva_boletoDTO dto);
}


