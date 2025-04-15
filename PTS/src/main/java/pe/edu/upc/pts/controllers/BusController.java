package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.BusDTO;
import pe.edu.upc.pts.entities.Bus;
import pe.edu.upc.pts.serviceInterfaces.IBusService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private IBusService bS;

    @GetMapping
    public List<BusDTO> listar(){
        return bS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,BusDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody BusDTO dto){
        dto.setIdBus(0); //Omite cualquier que este en el id, se genera automaticamente segun la secuencia
        ModelMapper m = new ModelMapper();
        Bus b = m.map(dto,Bus.class);
        bS.insert(b);
    }

    @PutMapping
    public void modificar(@RequestBody BusDTO dto){
        ModelMapper m = new ModelMapper();
        Bus b = m.map(dto,Bus.class);
        bS.update(b);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        bS.delete(id);
    }
}
