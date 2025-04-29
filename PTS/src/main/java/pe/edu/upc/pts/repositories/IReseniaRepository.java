package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Resenia;

import java.util.List;


@Repository
public interface IReseniaRepository extends JpaRepository<Resenia, Integer> {
    @Query(value = "SELECT u.username AS Username, COUNT(*) AS QuantityResenia " +
            "FROM Usuario u " +
            "INNER JOIN Resenia r ON u.id_usuario = r.id_usuario " +
            "GROUP BY u.username " +
            "ORDER BY COUNT(*) DESC " +
            "LIMIT 1", nativeQuery = true)
    List<String[]> QuantityReseniaByUsername();

}
