package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.TipoDTO;
import pe.edu.upc.pts.entities.Tipo;
import pe.edu.upc.pts.serviceInterfaces.ITipoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Tipo")


public class TipoController {
    @Autowired
    private ITipoService tS;
    @GetMapping
    public List<TipoDTO> listar(){
    return tS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
        return m.map(x,TipoDTO.class);
    }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody TipoDTO dto){
        dto.setId_tipo(0);
        ModelMapper m = new ModelMapper();
        Tipo t = m.map(dto, Tipo.class);
        tS.insert(t);
    }
}

