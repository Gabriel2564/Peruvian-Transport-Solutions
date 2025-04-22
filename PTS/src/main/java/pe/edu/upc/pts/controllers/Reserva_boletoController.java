package pe.edu.upc.pts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.Reserva_boletoDTO;
import pe.edu.upc.pts.serviceInterfaces.IReserva_boletoService;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class Reserva_boletoController {

    @Autowired
    private IReserva_boletoService reservaService;

    @GetMapping
    public ResponseEntity<List<Reserva_boletoDTO>> listarReservas() {
        List<Reserva_boletoDTO> lista = reservaService.listarReservas();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reserva_boletoDTO> insertarReserva(@RequestBody Reserva_boletoDTO reservaDTO) {
        Reserva_boletoDTO nuevaReserva = reservaService.insertarReserva(reservaDTO);
        return new ResponseEntity<>(nuevaReserva, HttpStatus.CREATED);
    }
}
