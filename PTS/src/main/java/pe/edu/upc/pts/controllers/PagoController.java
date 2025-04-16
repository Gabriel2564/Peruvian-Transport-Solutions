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
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private IPagoService pagoService;

    private final ModelMapper modelMapper = new ModelMapper();

    @GetMapping
    public List<PagoDTO> listar() {
        return pagoService.list().stream()
                .map(p -> modelMapper.map(p, PagoDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody PagoDTO dto) {
        Pago p = modelMapper.map(dto, Pago.class);
        pagoService.insert(p);
    }

    @PutMapping
    public void modificar(@RequestBody PagoDTO dto) {
        Pago p = modelMapper.map(dto, Pago.class);
        pagoService.update(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pagoService.delete(id);
    }
}
