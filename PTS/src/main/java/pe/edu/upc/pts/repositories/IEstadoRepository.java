
package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Estado;

import java.util.Optional;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado,Integer> {
    @Query("SELECT e FROM Estado e WHERE e.idEstado = :id")
    Optional<Estado> findByIdEstado(@Param("id") int id);
}

