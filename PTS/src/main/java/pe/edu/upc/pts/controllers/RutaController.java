package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.RutaDTO;
import pe.edu.upc.pts.entities.Ruta;
import pe.edu.upc.pts.serviceInterfaces.IRutaService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/rutas")
public class RutaController {
    @Autowired
    private IRutaService rS;


    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public List<RutaDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,RutaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public void insertar(@RequestBody RutaDTO dto){
        ModelMapper m = new ModelMapper();
        Ruta r = m.map(dto,Ruta.class);
        rS.insert(r);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public void modificar(@RequestBody RutaDTO dto){
        ModelMapper m = new ModelMapper();
        Ruta r = m.map(dto,Ruta.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }

    @GetMapping("/listar{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'CONDUCTOR')")
    public ResponseEntity<RutaDTO> obtenerPorId(@PathVariable("id") int id) {
        Ruta ruta = rS.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        RutaDTO dto = modelMapper.map(ruta, RutaDTO.class);
        return ResponseEntity.ok(dto);
    }
}
