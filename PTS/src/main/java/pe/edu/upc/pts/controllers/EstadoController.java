package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.pts.dtos.BusDTO;
import pe.edu.upc.pts.dtos.EstadoDTO;
import pe.edu.upc.pts.entities.Bus;
import pe.edu.upc.pts.entities.Estado;
import pe.edu.upc.pts.serviceInterfaces.IEstadoService;

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
    @PostMapping
    public void insertar(@RequestBody EstadoDTO dto){
        dto.setIdEstado(0); //Omite cualquier valor que este en el id, se genera automaticamente segun la secuencia
        ModelMapper m = new ModelMapper();
        Estado e = m.map(dto,Estado.class);
        eS.insert(e);
    }
    @PutMapping
    public void modificar(@RequestBody EstadoDTO dto){
        ModelMapper m = new ModelMapper();
        Estado e = m.map(dto,Estado.class);
        eS.update(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }

}


