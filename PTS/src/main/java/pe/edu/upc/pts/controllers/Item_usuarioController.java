package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.Item_UsuarioByTopDTO;
import pe.edu.upc.pts.dtos.Item_usuarioDTO;
import pe.edu.upc.pts.entities.Item_usuario;
import pe.edu.upc.pts.serviceInterfaces.IItem_usuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/item_usuario")
public class Item_usuarioController {
    @Autowired
    private IItem_usuarioService iS;

    @GetMapping("/listar")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<Item_usuarioDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,Item_usuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void insertar(@RequestBody Item_usuarioDTO dto){
        dto.setIdItemUsuario(0);
        ModelMapper m = new ModelMapper();
        Item_usuario i = m.map(dto, Item_usuario.class);
        iS.insert(i);
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody Item_usuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Item_usuario iu = m.map(dto,Item_usuario.class);
        iS.update(iu);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void eliminar(@PathVariable("id") Integer idItemUsuario){
        iS.delete(idItemUsuario);
    }

    @GetMapping("/topCalificados")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<Item_UsuarioByTopDTO> top5Items() {
        List<String[]> filaLista = iS.ObtenerTopCalificados();
        List<Item_UsuarioByTopDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            Item_UsuarioByTopDTO dto = new Item_UsuarioByTopDTO();
            dto.setId_item_user((Integer.parseInt((String) columna[0])));
            dto.setQualification_viaj((int) Integer.parseInt((String) columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
