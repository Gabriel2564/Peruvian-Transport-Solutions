package pe.edu.upc.pts.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pts.dtos.BusDTO;
import pe.edu.upc.pts.dtos.ItemDTO;
import pe.edu.upc.pts.entities.Item;
import pe.edu.upc.pts.serviceInterfaces.IItemService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private IItemService iS;

    @GetMapping("/Listar_Item")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<ItemDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ItemDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/Insertar_Item")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void insertar(@RequestBody ItemDTO dto){
        dto.setIdItem(0);
        ModelMapper m = new ModelMapper();
        Item i = m.map(dto,Item.class);
        iS.insert(i);
    }

    @PutMapping("/Modificar_Item")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody ItemDTO dto){
        ModelMapper m = new ModelMapper();
        Item i = m.map(dto,Item.class);
        iS.update(i);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }

    @GetMapping("/itemporformato")
    public List<ItemDTO> ItemByFormato(@RequestParam String formato) {
        return iS.ItemByFormato(formato).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ItemDTO.class);
        }).collect(Collectors.toList());
    }
}
