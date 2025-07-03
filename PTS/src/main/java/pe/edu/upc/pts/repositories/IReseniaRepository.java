package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Resenia;

import java.util.List;
import java.util.Optional;


@Repository
public interface IReseniaRepository extends JpaRepository<Resenia, Integer> {
    @Query(value = "SELECT u.username AS Username, COUNT(*) AS QuantityResenia " +
            "FROM usuario u " +
            "INNER JOIN resenia r ON u.id = r.id_usuario " +
            "GROUP BY u.username " +
            "ORDER BY COUNT(*) DESC ", nativeQuery = true)
    List<String[]> QuantityReseniaByUsername();

    @Query("SELECT r FROM Resenia r WHERE r.idResenia = :id")
    Optional<Resenia> findByIdResenia(@Param("id") int id);
}
