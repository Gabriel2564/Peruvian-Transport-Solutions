package pe.edu.upc.pts.controllers;

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
public class RutaController {
    @Autowired
    private IRutaService rS;

    @GetMapping
    public List<RutaDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,RutaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody RutaDTO dto){
        dto.setIdRuta(0); //Omite cualquier valor que este en el id, se genera automaticamente segun la secuencia
        ModelMapper m = new ModelMapper();
        Ruta r = m.map(dto,Ruta.class);
        rS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody RutaDTO dto){
        ModelMapper m = new ModelMapper();
        Ruta r = m.map(dto,Ruta.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }
}
