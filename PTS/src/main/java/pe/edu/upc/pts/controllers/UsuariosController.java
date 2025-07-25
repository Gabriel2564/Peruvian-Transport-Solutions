package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.*;
import pe.edu.upc.pts.entities.Usuarios;
import pe.edu.upc.pts.serviceInterfaces.IUsuariosService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private IUsuariosService uS;

    @GetMapping("/listar")
    public List <UserSecurityDTO> listar(){

        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UserSecurityDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    public void insert (@RequestBody UsuariosDTO dtouser){
        ModelMapper m=new ModelMapper();
        Usuarios u = m.map(dtouser, Usuarios.class);
        uS.insertUser(u);
    }

    @GetMapping("/listar/{id}")
    public UserSecurityDTO listarId(@PathVariable ("id") Integer id){
        ModelMapper m=new ModelMapper();
        UserSecurityDTO dto=m.map(uS.listId(id), UserSecurityDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void delete(@PathVariable ("id") Integer id){
        uS.delete(id);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody UserSecurityDTO dto){
        ModelMapper m=new ModelMapper();
        Usuarios u=m.map(dto, Usuarios.class);
        uS.update(u);
    }


}
