package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Asiento;

import java.util.Optional;

@Repository
public interface IAsientoRepository extends JpaRepository<Asiento, Integer> {
    @Query("SELECT a FROM Asiento a WHERE a.idAsiento = :id")
    Optional<Asiento> findByIdAsiento(@Param("id") int id);
}
