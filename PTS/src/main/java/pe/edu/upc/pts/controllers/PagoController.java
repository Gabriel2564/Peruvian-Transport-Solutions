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

    private final ModelMapper modelMapper = new ModelMapper();

    @GetMapping
    public List<PagoDTO> list() {
        return paymentService.list().stream()
                .map(p -> modelMapper.map(p, PagoDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody PagoDTO dto) {
        Pago payment = modelMapper.map(dto, Pago.class);
        paymentService.insert(payment);
    }

    @PutMapping
    public void update(@RequestBody PagoDTO dto) {
        Pago payment = modelMapper.map(dto, Pago.class);
        paymentService.update(payment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        paymentService.delete(id);
    }
}
