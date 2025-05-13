package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Asiento;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAsientoRepository extends JpaRepository<Asiento, Integer> {
    @Query("SELECT a FROM Asiento a WHERE a.idAsiento = :id")
    Optional<Asiento> findByIdAsiento(@Param("id") int id);

    @Query(value = "SELECT \n" +
            "    a.id_bus AS id_bus,\n" +
            "    e.status_type_estado AS tipo_estado,\n" +
            "    COUNT(*) * 100.0 / total.total_asientos AS porcentaje\n" +
            "FROM asiento a\n" +
            "JOIN estado e ON a.id_estado = e.id_estado\n" +
            "JOIN (\n" +
            "    SELECT id_bus, COUNT(*) AS total_asientos\n" +
            "    FROM asiento\n" +
            "    GROUP BY id_bus\n" +
            ") AS total ON a.id_bus = total.id_bus\n" +
            "GROUP BY a.id_bus, e.status_type_estado, total.total_asientos;", nativeQuery = true)
    List<String[]> obtenerPorcentajeEstadoPorBus();

    @Query(value = "SELECT \n" +
            "    id_bus AS id_bus,\n" +
            "    COUNT(id_asiento) AS cantidad_asientos\n" +
            "FROM \n" +
            "    asiento\n" +
            "GROUP BY \n" +
            "    id_bus;", nativeQuery = true)
    List<String[]> contarAsientosPorBus();
}
