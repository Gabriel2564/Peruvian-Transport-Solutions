package pe.edu.upc.peruviantransportsolutions.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.peruviantransportsolutions.dtos.EstadoDTO;
import pe.edu.upc.peruviantransportsolutions.servicesInterfaces.IEstadoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estados")
public class EstadoController {
    @Autowired
    private IEstadoService eS;

    @GetMapping
    public List<EstadoDTO> listar() {

        return eS.listar_estado().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstadoDTO.class);
        }).collect(Collectors.toList());
    }
}


