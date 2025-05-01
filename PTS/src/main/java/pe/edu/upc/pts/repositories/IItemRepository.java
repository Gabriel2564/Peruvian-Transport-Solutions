package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.pts.entities.Item;

public interface IItemRepository extends JpaRepository<Item, Integer> {
}
