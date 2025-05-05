package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.BusDTO;
import pe.edu.upc.pts.entities.Bus;
import pe.edu.upc.pts.serviceInterfaces.IBusService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController

@RequestMapping("/buses")
public class BusController {
    @Autowired
    private IBusService bS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('CONDUCTOR','ADMINISTRADOR')")
    public List<BusDTO> listar(){
        return bS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,BusDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void insertar(@RequestBody BusDTO dto){
        dto.setIdBus(0);
        ModelMapper m = new ModelMapper();
        Bus b = m.map(dto,Bus.class);
        bS.insert(b);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody BusDTO dto){
        ModelMapper m = new ModelMapper();
        Bus b = m.map(dto,Bus.class);
        bS.update(b);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        bS.delete(id);
    }

    @GetMapping("/busporfechaylugar")
    public List<BusDTO> BusByDateViajeAndArrivalAddressBus(@RequestParam LocalDate fecha, String lugar) {
        return bS.BusByDateViajeAndArrivalAddressBus(fecha, lugar).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,BusDTO.class);
        }).collect(Collectors.toList());
    }
}
