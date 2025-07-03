package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.EstadoDTO;
import pe.edu.upc.pts.entities.Estado;
import pe.edu.upc.pts.serviceInterfaces.IEstadoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estados")
public class EstadoController {
    @Autowired
    private IEstadoService eS;

    @GetMapping("/lista")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA', 'CONDUCTOR')")
    public List<EstadoDTO> listar() {
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstadoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA', 'CONDUCTOR')")
    public void insertar(@RequestBody EstadoDTO dto){
        ModelMapper m = new ModelMapper();
        Estado e = m.map(dto,Estado.class);
        eS.insert(e);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA', 'CONDUCTOR')")
    public void modificar(@RequestBody EstadoDTO dto){
        ModelMapper m = new ModelMapper();
        Estado e = m.map(dto,Estado.class);
        eS.update(e);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA', 'CONDUCTOR')")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/listar{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA', 'CONDUCTOR')")
    public ResponseEntity<EstadoDTO> obtenerPorId(@PathVariable("id") int id) {
        Estado estado = eS.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        EstadoDTO dto = modelMapper.map(estado, EstadoDTO.class);
        return ResponseEntity.ok(dto);
    }
}


