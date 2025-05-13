package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.pts.entities.Item;

import java.util.List;
import java.util.Optional;

@Repository
public interface IItemRepository extends JpaRepository<Item, Integer> {

    @Query(value = "SELECT i FROM Item i WHERE i.formatItem = :formato")
    List<Item> ItemByFormato(@Param("formato") String formato);

    @Query("SELECT i FROM Item i WHERE i.idItem = :id")
    Optional<Item> findItemById(@Param("id") int id);
}
