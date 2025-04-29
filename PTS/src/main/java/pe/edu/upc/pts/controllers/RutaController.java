package pe.edu.upc.pts.controllers;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.RutaDTO;
import pe.edu.upc.pts.entities.Ruta;
import pe.edu.upc.pts.serviceInterfaces.IRutaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutas")
@Slf4j
public class RutaController {
    @Autowired
    private IRutaService rS;

    @GetMapping
    public List<RutaDTO> listar() {
        log.info("Solicitud GET para listar rutas");
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RutaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RutaDTO dto) {
        log.info("Solicitud POST para insertar ruta: {}", dto.getLocation());
        dto.setIdRuta(0); //Omite cualquier valor que este en el id, se genera automaticamente segun la secuencia
        ModelMapper m = new ModelMapper();
        Ruta r = m.map(dto, Ruta.class);
        rS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody RutaDTO dto) {
        log.info("Solicitud PUT para modificar ruta con ID: {}", dto.getIdRuta());
        ModelMapper m = new ModelMapper();
        Ruta r = m.map(dto, Ruta.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        log.warn("Solicitud DELETE para eliminar ruta con ID: {}", id);
        rS.delete(id);

    }

    //QUERY BUSCAR RUTA POR ITEM
    @GetMapping("/item/{itemId}")
    public List<RutaDTO> searchByItem(@PathVariable int itemId) {
        log.info("Solicitud GET para buscar rutas por item ID: {}", itemId);
        return rS.searchByItem(itemId);
    }
}