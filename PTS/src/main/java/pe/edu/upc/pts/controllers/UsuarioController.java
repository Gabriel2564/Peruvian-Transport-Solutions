package pe.edu.upc.pts.controllers;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.UsuarioByRolDTO;
import pe.edu.upc.pts.dtos.UsuarioDTO;
import pe.edu.upc.pts.entities.Usuario;
import pe.edu.upc.pts.serviceInterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
@Slf4j
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @GetMapping
    public List<UsuarioDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody UsuarioDTO dto){
        dto.setId_usuario(0);
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto,Usuario.class);
        uS.insert(u);
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto,Usuario.class);
        uS.update(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

    @GetMapping("/query1")
    public List<UsuarioByRolDTO> query1() {
        List<String[]> filaLista = uS.QuantityUsuarioByRol();
        List<UsuarioByRolDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            UsuarioByRolDTO dto = new UsuarioByRolDTO();
            dto.setNameRol(columna[0]);
            dto.setQuantityUsuario(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
