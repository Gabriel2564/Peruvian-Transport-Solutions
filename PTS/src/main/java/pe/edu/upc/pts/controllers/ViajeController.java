package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.ViajeByRutaDTO;
import pe.edu.upc.pts.dtos.ViajeDTO;
import pe.edu.upc.pts.entities.Viaje;
import pe.edu.upc.pts.serviceInterfaces.IViajeService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/viajes")
public class ViajeController {
    @Autowired
    private IViajeService vS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public List<ViajeDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ViajeDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public void registrar(@RequestBody ViajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Viaje v = m.map(dto, Viaje.class);
        vS.insert(v);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public void modificar(@RequestBody ViajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Viaje v = m.map(dto, Viaje.class);
        vS.insert(v);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public void eliminar(@PathVariable("id") Integer id){
        vS.delete(id);
    }


    @GetMapping("/viajePorRuta")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<ViajeByRutaDTO> query1() {
        List<String[]> filaLista = vS.QuantityViajeByRuta();
        List<ViajeByRutaDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ViajeByRutaDTO dto = new ViajeByRutaDTO();
            dto.setLocation(columna[0]);
            dto.setQuantityViaje(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/listar/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<ViajeDTO> obtenerPorId(@PathVariable("id") int id) {
        Viaje viaje = vS.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        ViajeDTO dto = modelMapper.map(viaje, ViajeDTO.class);
        return ResponseEntity.ok(dto);
    }
}
