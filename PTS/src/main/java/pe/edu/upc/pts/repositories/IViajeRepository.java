package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Viaje;

import java.util.List;
import java.util.Optional;

@Repository
public interface IViajeRepository extends JpaRepository<Viaje, Integer> {
    @Query(value = "SELECT r.id_ruta AS Ruta, COUNT(v.id_viaje) AS QuantityViaje " +
            "FROM Ruta r " +
            "INNER JOIN Viaje v ON r.id_ruta = v.id_ruta " +
            "GROUP BY r.id_ruta", nativeQuery = true)
    List<String[]> QuantityViajeByRuta();

    @Query("SELECT v FROM Viaje v WHERE v.idViaje = :id")
    Optional<Viaje> findByIdViaje(@Param("id") int id);
}
