package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.ViajeByRutaDTO;
import pe.edu.upc.pts.dtos.ViajeDTO;
import pe.edu.upc.pts.entities.Viaje;
import pe.edu.upc.pts.serviceInterfaces.IViajeService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/viajes")
public class ViajeController {
    @Autowired
    private IViajeService vS;

    @GetMapping
    public List<ViajeDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ViajeDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody ViajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Viaje v = m.map(dto, Viaje.class);
        vS.insert(v);
    }

    @PutMapping
    public void modificar(@RequestBody ViajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Viaje v = m.map(dto, Viaje.class);
        vS.insert(v);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        vS.delete(id);
    }

    @GetMapping("/query1")
    public List<ViajeByRutaDTO> query1() {
        List<String[]> filaLista = vS.QuantityViajeByRuta();
        List<ViajeByRutaDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ViajeByRutaDTO dto = new ViajeByRutaDTO();
            dto.setLocation(columna[0]);
            dto.setQuantityViaje(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
