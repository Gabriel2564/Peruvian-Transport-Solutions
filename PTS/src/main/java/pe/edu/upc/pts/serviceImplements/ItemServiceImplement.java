package pe.edu.upc.pts.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pts.entities.Item;
import pe.edu.upc.pts.repositories.IItemRepository;
import pe.edu.upc.pts.serviceInterfaces.IItemService;

import java.util.List;

@Service
public class ItemServiceImplement implements IItemService {
    @Autowired
    private IItemRepository iR;

    @Override
    public List<Item> list() { return iR.findAll(); }

    @Override
    public void insert(Item item) { iR.save(item); }

    @Override
    public void update(Item item) { iR.save(item); }

    @Override
    public void delete(int id) { iR.deleteById(id); }
}
