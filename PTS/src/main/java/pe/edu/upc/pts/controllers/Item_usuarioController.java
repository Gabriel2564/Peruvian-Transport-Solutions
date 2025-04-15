package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.Item_usuarioDTO;
import pe.edu.upc.pts.entities.Item_usuario;
import pe.edu.upc.pts.serviceInterfaces.IItem_usuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/item_usuario")

public class Item_usuarioController {
    @Autowired
    private IItem_usuarioService iS;

    @GetMapping
    public List<Item_usuarioDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,Item_usuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody Item_usuarioDTO dto){
        dto.setId_item_usuario(0);
        ModelMapper m = new ModelMapper();
        Item_usuario i = m.map(dto, Item_usuario.class);
        iS.insert(i);
    }
}

