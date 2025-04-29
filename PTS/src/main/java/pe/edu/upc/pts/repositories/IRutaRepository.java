package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Ruta;

import java.util.List;

@Repository
public interface IRutaRepository extends JpaRepository<Ruta, Integer> {
    //Buscar todas las rutas asociadas a un ítem específico.
    @Query("SELECT r FROM Ruta r WHERE r.item.idItem = :itemId")
    List<Ruta> findByItemId(@Param("itemId") int itemId);
}
