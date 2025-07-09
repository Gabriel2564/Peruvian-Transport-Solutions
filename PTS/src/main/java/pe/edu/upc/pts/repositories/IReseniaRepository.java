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
    @Query(value = "SELECT u.username AS Username, COUNT(r.id_resenia) AS QuantityResenia " +
            "FROM usuarios u " +
            "INNER JOIN Resenia r ON u.id_usuario = r.id_usuario " +
            "GROUP BY u.username "
            , nativeQuery = true)
    List<String[]> QuantityReseniaByUsername();


    @Query("SELECT r FROM Resenia r WHERE r.idResenia = :id")
    Optional<Resenia> findByIdResenia(@Param("id") int id);
}
