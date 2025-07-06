package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.PagoDTO;
import pe.edu.upc.pts.dtos.PaymentsByTypeDTO;
import pe.edu.upc.pts.entities.Pago;
import pe.edu.upc.pts.serviceInterfaces.IPagoService;

import java.util.ArrayList;
import java.util.List;
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

    @GetMapping("/paymentsByType")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<PaymentsByTypeDTO> countPaymentsByType() {
        List<String[]> filaLista = paymentService.countPaymentsByType();
        List<PaymentsByTypeDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            PaymentsByTypeDTO dto = new PaymentsByTypeDTO();
            dto.setTotal(Integer.parseInt(columna[1]));
            dto.setTipoPago(columna[0]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }


    @GetMapping("/listar/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<PagoDTO> obtenerPorId(@PathVariable("id") int id) {
        Pago pago = paymentService.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        PagoDTO dto = modelMapper.map(pago, PagoDTO.class);
        return ResponseEntity.ok(dto);
    }
}
