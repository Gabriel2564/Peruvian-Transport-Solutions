package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.Reserva_boletoDTO;
import pe.edu.upc.pts.entities.Reserva_boleto;
import pe.edu.upc.pts.serviceInterfaces.IReserva_boletoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class Reserva_boletoController {

    @Autowired
    private IReserva_boletoService reservaService;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public List<Reserva_boletoDTO> listar() {
        return reservaService.list().stream().map(reserva -> {
            ModelMapper m = new ModelMapper();
            return m.map(reserva, Reserva_boletoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA')")
    public void insertar(@RequestBody Reserva_boletoDTO dto) {
        dto.setIdReservaBoleto(0); // Se ignora el ID si viene con valor, lo genera automáticamente
        ModelMapper m = new ModelMapper();
        Reserva_boleto reserva = m.map(dto, Reserva_boleto.class);
        reservaService.insert(reserva);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA')")
    public void modificar(@RequestBody Reserva_boletoDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva_boleto reserva = m.map(dto, Reserva_boleto.class);
        reservaService.update(reserva);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA', 'CONDUCTOR')")
    public void eliminar(@PathVariable("id") int id) {
        reservaService.delete(id);
    }

    @GetMapping("/listar{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<Reserva_boletoDTO> obtenerPorId(@PathVariable("id") int id) {
        Reserva_boleto reservaBoleto = reservaService.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        Reserva_boletoDTO dto = modelMapper.map(reservaBoleto, Reserva_boletoDTO.class);
        return ResponseEntity.ok(dto);
    }
}
