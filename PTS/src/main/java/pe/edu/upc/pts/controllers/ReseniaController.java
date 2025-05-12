package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.ReseniaByUsernameDTO;
import pe.edu.upc.pts.dtos.ReseniaDTO;
import pe.edu.upc.pts.entities.Resenia;
import pe.edu.upc.pts.serviceInterfaces.IReseniaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Resenia")
public class ReseniaController {
    @Autowired
    private IReseniaService rS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA', 'CONDUCTOR')")
    public List<ReseniaDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ReseniaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA')")
    public void insertar(@RequestBody ReseniaDTO dto){
        dto.setIdResenia(0);
        ModelMapper m = new ModelMapper();
        Resenia r = m.map(dto,Resenia.class);
        rS.insert(r);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA')")
    public void modificar(@RequestBody ReseniaDTO dto){
        ModelMapper m = new ModelMapper();
        Resenia r = m.map(dto,Resenia.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA')")
    public void eliminar(@PathVariable("id_resenia") Integer idResenia){
        rS.delete(idResenia);
    }

    @GetMapping("/busquedaPorNombre")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'TURISTA', 'CONDUCTOR')")
    public List<ReseniaByUsernameDTO> Mayor() {
        List<String[]> filaLista = rS.QuantityReseniaByUsuario();
        List<ReseniaByUsernameDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ReseniaByUsernameDTO dto = new ReseniaByUsernameDTO();
            dto.setUsername(columna[0]);
            dto.setQuantityResenia(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/listar{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<ReseniaDTO> obtenerPorId(@PathVariable("id") int id) {
        Resenia resenia = rS.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        ReseniaDTO dto = modelMapper.map(resenia, ReseniaDTO.class);
        return ResponseEntity.ok(dto);
    }
}
