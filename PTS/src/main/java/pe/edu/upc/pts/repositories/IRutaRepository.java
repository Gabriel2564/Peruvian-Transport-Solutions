package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Ruta;

import java.util.Optional;

@Repository
public interface IRutaRepository extends JpaRepository<Ruta, Integer> {
    @Query("SELECT r FROM Ruta r WHERE r.idRuta = :id")
    Optional<Ruta> findByIdRuta(@Param("id") int id);
}
