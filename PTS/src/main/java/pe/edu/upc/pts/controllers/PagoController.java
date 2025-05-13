package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.PagoDTO;
import pe.edu.upc.pts.entities.Pago;
import pe.edu.upc.pts.serviceInterfaces.IPagoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/payments")
public class PagoController {

    @Autowired
    private IPagoService paymentService;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','TURISTA')")
    public List<PagoDTO> list() {
        return paymentService.list().stream().map(p->{
            ModelMapper m = new ModelMapper();
            return m.map(p, PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','TURISTA')")
    public void insert(@RequestBody PagoDTO dto) {
        dto.setIdPago(0);
        ModelMapper m = new ModelMapper();
        Pago payment = m.map(dto, Pago.class);
        paymentService.insert(payment);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','TURISTA')")
    public void update(@RequestBody PagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pago payment = m.map(dto, Pago.class);
        paymentService.update(payment);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','TURISTA')")
    public void delete(@PathVariable("id") Integer id) {
        paymentService.delete(id);
    }

    @GetMapping("/tipo/{tipo}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<List<Pago>> getPagosPorTipo(@PathVariable("tipo") String tipo) {
        List<Pago> dto = paymentService.findByPaymentType(tipo);

        return ResponseEntity.ok(dto);
    }

    @GetMapping("/resumen")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<List<Map<String, Object>>> resumenPagos() {
        List<Object[]> conteo = paymentService.countPaymentsByType();

        List<Map<String, Object>> dto = conteo.stream().map(obj -> {
            Map<String, Object> map = new HashMap<>();
            map.put("tipoPago", obj[0]);
            map.put("total", obj[1]);
            return map;
        }).collect(Collectors.toList());

        return ResponseEntity.ok(dto);
    }


    @GetMapping("/listar{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<PagoDTO> obtenerPorId(@PathVariable("id") int id) {
        Pago pago = paymentService.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        PagoDTO dto = modelMapper.map(pago, PagoDTO.class);
        return ResponseEntity.ok(dto);
    }
}
