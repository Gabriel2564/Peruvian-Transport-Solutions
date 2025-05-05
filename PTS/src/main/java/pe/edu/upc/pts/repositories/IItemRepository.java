package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.pts.entities.Item;

import java.time.LocalDate;
import java.util.List;

public interface IItemRepository extends JpaRepository<Item, Integer> {

    @Query(value = "SELECT i FROM Item i WHERE i.formatItem = :formato")
    List<Item> ItemByFormato(@Param("formato") String formato);
}
