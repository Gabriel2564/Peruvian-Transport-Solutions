package pe.edu.upc.pts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.Reserva_boletoDTO;
import pe.edu.upc.pts.serviceInterfaces.IReserva_boletoService;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class Reserva_boletoController {

    @Autowired
    private IReserva_boletoService reservationService;

    @GetMapping
    public ResponseEntity<List<Reserva_boletoDTO>> listReservations() {
        List<Reserva_boletoDTO> list = reservationService.listReservations();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reserva_boletoDTO> insertReservation(@RequestBody Reserva_boletoDTO reservationDTO) {
        Reserva_boletoDTO newReservation = reservationService.insertReservation(reservationDTO);
        return new ResponseEntity<>(newReservation, HttpStatus.CREATED);
    }
}
