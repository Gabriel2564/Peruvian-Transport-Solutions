package pe.edu.upc.pts.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.QuantityUserByRolDTO;
import pe.edu.upc.pts.dtos.RolesDTO;
import pe.edu.upc.pts.entities.Role;
import pe.edu.upc.pts.serviceInterfaces.IRolesService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private IRolesService rS;

    @GetMapping("/listar")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<RolesDTO> listar(){

        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RolesDTO.class);
        }).collect(Collectors.toList());
    }


    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void registrar(@RequestBody RolesDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insertRoles(r);
    }

    @GetMapping("/listar/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public RolesDTO listarId(@PathVariable ("id") Long id){
        ModelMapper m=new ModelMapper();
        RolesDTO dto=m.map(rS.listId(id), RolesDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void delete(@PathVariable ("id") Long id){
        rS.delete(id);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody RolesDTO dto){
        ModelMapper m=new ModelMapper();
        Role r=m.map(dto, Role.class);
        rS.update(r);
    }

    @GetMapping("/totalDeUsuariosPorRol")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<QuantityUserByRolDTO> totalDeUsuariosPorRol() {
        List<String[]> filaLista = rS.quantityUserByRol();
        List<QuantityUserByRolDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            QuantityUserByRolDTO dto = new QuantityUserByRolDTO();
            dto.setRol(columna[0]);
            dto.setTotal_usuarios(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}
