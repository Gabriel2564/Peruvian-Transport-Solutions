package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.ItemDTO;
import pe.edu.upc.pts.entities.Item;
import pe.edu.upc.pts.serviceInterfaces.IItemService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private IItemService iS;

    @GetMapping
    public List<ItemDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ItemDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ItemDTO dto){
        dto.setIdItem(0);
        ModelMapper m = new ModelMapper();
        Item i = m.map(dto,Item.class);
        iS.insert(i);
    }

    @PutMapping
    public void modificar(@RequestBody ItemDTO dto){
        ModelMapper m = new ModelMapper();
        Item i = m.map(dto,Item.class);
        iS.update(i);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }
}
