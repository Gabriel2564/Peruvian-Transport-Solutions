package pe.edu.upc.pts.controllers;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.AsientoDTO;
import pe.edu.upc.pts.entities.Asiento;
import pe.edu.upc.pts.serviceInterfaces.IAsientoService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/asientos")
@Slf4j
public class AsientoController {

    @Autowired
    private IAsientoService aS;

    @GetMapping
    public List<AsientoDTO> listar() {
        log.info("Solicitud GET para listar asientos");
        return aS.listar_asiento().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AsientoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody AsientoDTO dto) {
        log.info("Solicitud POST para insertar asiento de bus ID: {}", dto.getBus().getIdBus());
        dto.setIdAsiento(0); //Omite cualquier valor que este en el id, se genera automaticamente segun la secuencia
        ModelMapper m = new ModelMapper();
        Asiento a = m.map(dto, Asiento.class);
        aS.insert(a);
    }

    @PutMapping
    public void modificar(@RequestBody AsientoDTO dto) {
        log.info("Solicitud PUT para modificar asiento con ID: {}", dto.getIdAsiento());
        ModelMapper m = new ModelMapper();
        Asiento a = m.map(dto, Asiento.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        log.warn("Solicitud DELETE para eliminar asiento con ID: {}", id);
        aS.delete(id);
    }

    @GetMapping("/buscar/{busId}/{seat_number}")
    public AsientoDTO buscarAsientoPorBusYNumero(@PathVariable int busId, @PathVariable int seat_number) {
        log.info("Solicitud GET para buscar asiento por bus ID: {} y número: {}", busId, seat_number);
        return aS.buscarPorNumeroYBus(seat_number, busId);
    }
}
