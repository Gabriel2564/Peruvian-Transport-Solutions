package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Item_usuario;

import java.util.List;

@Repository
public interface IItem_usuarioRepository extends JpaRepository<Item_usuario, Integer> {
    @Query(value = "SELECT iu.id_item_user, MAX(iu.qualification_viaj) AS max_qualification_viaj " +
            "FROM item_usuario iu " +
            "GROUP BY iu.id_item_user " +
            "ORDER BY max_qualification_viaj DESC " +
            "LIMIT 5", nativeQuery = true)
    List<String[]> ObtenerTopCalificados();
}
