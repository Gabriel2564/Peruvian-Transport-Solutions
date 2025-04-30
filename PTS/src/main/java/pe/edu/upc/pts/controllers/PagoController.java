package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.PagoDTO;
import pe.edu.upc.pts.entities.Pago;
import pe.edu.upc.pts.serviceInterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/payments")
public class PagoController {

    @Autowired
    private IPagoService paymentService;

    @GetMapping
    public List<PagoDTO> list() {
        return paymentService.list().stream().map(p->{
            ModelMapper m = new ModelMapper();
            return m.map(p, PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody PagoDTO dto) {
        dto.setIdPago(0);
        ModelMapper m = new ModelMapper();
        Pago payment = m.map(dto, Pago.class);
        paymentService.insert(payment);
    }

    @PutMapping
    public void update(@RequestBody PagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pago payment = m.map(dto, Pago.class);
        paymentService.update(payment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        paymentService.delete(id);
    }
}
