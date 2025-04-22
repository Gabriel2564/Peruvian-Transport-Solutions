package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.repositories.IPagoRepository;
import pe.edu.upc.pts.repositories.IReserva_boletoRepository;
import pe.edu.upc.pts.serviceInterfaces.IReserva_boletoService;

@Service
public class Reserva_boletoServiceImplement implements IReserva_boletoService {

    @Autowired
    private IReserva_boletoRepository reservaRepo;

    @Autowired
    private IUsuarioRepository usuarioRepo;
    @Autowired
    private IPagoRepository pagoRepo;
    @Autowired
    private IAsientoRepository asientoRepo;

    @Override
    public List<Reserva_boletoDTO> listarReservas() {
        return reservaRepo.findAll().stream().map(this::convertToDTO).toList();
    }

    @Override
    public Reserva_boletoDTO insertarReserva(Reserva_boletoDTO dto) {
        Reserva_boleto reserva = new Reserva_boleto();
        reserva.setMontoBoleto(dto.getMontoBoleto());
        reserva.setCantidadAsientos(dto.getCantidadAsientos());
        reserva.setUsuario(usuarioRepo.findById(dto.getUsuarioId()).orElse(null));
        reserva.setPago(pagoRepo.findById(dto.getPagoId()).orElse(null));
        reserva.setAsiento(asientoRepo.findById(dto.getAsientoId()).orElse(null));
        return convertToDTO(reservaRepo.save(reserva));
    }

    private Reserva_boletoDTO convertToDTO(Reserva_boleto reserva) {
        Reserva_boletoDTO dto = new Reserva_boletoDTO();
        dto.setIdReservabol(reserva.getIdReservabol());
        dto.setMontoBoleto(reserva.getMontoBoleto());
        dto.setCantidadAsientos(reserva.getCantidadAsientos());
        dto.setUsuarioId(reserva.getUsuario().getIdUsuario());
        dto.setPagoId(reserva.getPago().getIdPago());
        dto.setAsientoId(reserva.getAsiento().getIdAsiento());
        return dto;
    }
}

