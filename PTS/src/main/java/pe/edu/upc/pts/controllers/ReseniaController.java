package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.ReseniaByUsernameDTO;
import pe.edu.upc.pts.dtos.ReseniaDTO;
import pe.edu.upc.pts.dtos.UsuarioByRolDTO;
import pe.edu.upc.pts.entities.Resenia;
import pe.edu.upc.pts.serviceInterfaces.IReseniaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Resenia")
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
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id_resenia") Integer id_Resenia){
        rS.delete(id_Resenia);
    }

    @GetMapping("/Mayor")
    public List<ReseniaByUsernameDTO> Mayor() {
        List<String[]> filaLista = rS.QuantityReseniaByUsuario();
        List<ReseniaByUsernameDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ReseniaByUsernameDTO dto = new ReseniaByUsernameDTO();
            dto.setUsername(columna[0]);
            dto.setQuantityResenia(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
