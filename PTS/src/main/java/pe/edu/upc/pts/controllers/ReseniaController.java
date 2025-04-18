package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.ReseniaDTO;
import pe.edu.upc.pts.entities.Resenia;
import pe.edu.upc.pts.serviceInterfaces.IReseniaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/Resenia")
public class ReseniaController {
    @Autowired
    private IReseniaService rS;

    @GetMapping
    public List<ReseniaDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ReseniaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody ReseniaDTO dto){
        dto.setId_Resenia(0);
        ModelMapper m = new ModelMapper();
        Resenia r = m.map(dto,Resenia.class);
        rS.insert(r);
    }
}
