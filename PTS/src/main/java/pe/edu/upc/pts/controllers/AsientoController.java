package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.AsientoDTO;
import pe.edu.upc.pts.dtos.CantidadAsientosDTO;
import pe.edu.upc.pts.dtos.PorcentajeEstadoAsientoDTO;
import pe.edu.upc.pts.entities.Asiento;
import pe.edu.upc.pts.serviceInterfaces.IAsientoService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/asientos")
public class AsientoController {

    @Autowired
    private IAsientoService aS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','TURISTA')")
    public List<AsientoDTO> listar() {
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, AsientoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','TURISTA')")
    public void insertar(@RequestBody AsientoDTO dto){
        ModelMapper m = new ModelMapper();
        Asiento a = m.map(dto,Asiento.class);
        aS.insert(a);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','TURISTA')")
    public void modificar(@RequestBody AsientoDTO dto){
        ModelMapper m = new ModelMapper();
        Asiento a = m.map(dto,Asiento.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','TURISTA')")
    public void eliminar(@PathVariable("id") Integer id){
        aS.delete(id);
    }

    @GetMapping("/listar/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<AsientoDTO> obtenerPorId(@PathVariable("id") int id) {
        Asiento asiento = aS.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        AsientoDTO dto = modelMapper.map(asiento, AsientoDTO.class);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/cantidadAsientosPorBus")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<CantidadAsientosDTO> obtenerCantidadAsientosPorBus() {
        List<String[]> filaLista = aS.contarAsientosPorBus();
        List<CantidadAsientosDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            CantidadAsientosDTO dto = new CantidadAsientosDTO();
            dto.setIdBus(Integer.parseInt(columna[0]));
            dto.setCantidadAsientos(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/porcentajeEstadoPorBus")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<PorcentajeEstadoAsientoDTO> obtenerPorcentajeEstadoPorBus() {
        List<String[]> filaLista = aS.obtenerPorcentajeEstadoPorBus();
        List<PorcentajeEstadoAsientoDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            PorcentajeEstadoAsientoDTO dto = new PorcentajeEstadoAsientoDTO();
            dto.setIdBus(Integer.parseInt(columna[0]));
            dto.setTipoEstado(columna[1]);
            dto.setPorcentaje(Double.parseDouble(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
