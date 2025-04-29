package pe.edu.upc.pts.controllers;

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
public class AsientoController {

    @Autowired
    private IAsientoService aS;

    @GetMapping
    public List<AsientoDTO> listar() {

        return aS.listar_asiento().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, AsientoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody AsientoDTO dto){
        dto.setIdAsiento(0); //Omite cualquier valor que este en el id, se genera automaticamente segun la secuencia
        ModelMapper m = new ModelMapper();
        Asiento a = m.map(dto,Asiento.class);
        aS.insert(a);
    }
}
