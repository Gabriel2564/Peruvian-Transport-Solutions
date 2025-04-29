package pe.edu.upc.pts.controllers;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.pts.dtos.EstadoDTO;
import pe.edu.upc.pts.dtos.PorcentajeEstadoXAsientoDTO;
import pe.edu.upc.pts.entities.Estado;
import pe.edu.upc.pts.serviceInterfaces.IEstadoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estados")
@Slf4j
public class EstadoController {
    @Autowired
    private IEstadoService eS;

    @GetMapping
    public List<EstadoDTO> listar() {
        log.info("Solicitud GET para listar estados");
        return eS.listar_estado().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstadoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody EstadoDTO dto){
        log.info("Solicitud POST para insertar estado: {}", dto.getState_type());
        dto.setIdEstado(0); //Omite cualquier valor que este en el id, se genera automaticamente segun la secuencia
        ModelMapper m = new ModelMapper();
        Estado e = m.map(dto,Estado.class);
        eS.insert(e);
    }
    @PutMapping
    public void modificar(@RequestBody EstadoDTO dto){
        log.info("Solicitud PUT para modificar estado con ID: {}", dto.getIdEstado());
        ModelMapper m = new ModelMapper();
        Estado e = m.map(dto,Estado.class);
        eS.update(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        log.warn("Solicitud DELETE para eliminar estado con ID: {}", id);
        eS.delete(id);
    }
    @GetMapping("/porcentaje")
    public List<PorcentajeEstadoXAsientoDTO> obtenerPorcentajeEstadoAsiento() {
        log.info("Solicitud GET para obtener porcentaje de estados por asiento");
        return eS.listarPorcentajeEstadoAsiento();
    }

}


