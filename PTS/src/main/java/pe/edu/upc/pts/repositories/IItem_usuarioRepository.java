package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Item_usuario;

import java.util.List;
import java.util.Optional;

@Repository
public interface IItem_usuarioRepository extends JpaRepository<Item_usuario, Integer> {
    @Query(value = "SELECT iu.id_item_usuario, MAX(iu.travel_qualification_item_usuario) AS max_qualification_viaj " +
            "FROM item_usuario iu " +
            "GROUP BY iu.id_item_usuario " +
            "ORDER BY max_qualification_viaj DESC " +
            "LIMIT 5", nativeQuery = true)
    List<String[]> ObtenerTopCalificados();

    @Query("SELECT i FROM Item_usuario i WHERE i.idItemUsuario = :id")
    Optional<Item_usuario> findByIdItemUsuario(@Param("id") int id);
}
