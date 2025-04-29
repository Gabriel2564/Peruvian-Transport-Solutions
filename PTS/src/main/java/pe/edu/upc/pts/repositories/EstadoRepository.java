package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Estado;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {
    @Query(value = "SELECT e.state_name AS stateName, " +
            "       e.state_type AS stateType, " +
            "       COUNT(a.id_asiento) AS totalAsientos, " +
            "       (COUNT(a.id_asiento) * 100.0 / NULLIF((SELECT COUNT(*) FROM asiento), 0)) AS porcentaje " +
            "FROM estado e " +
            "INNER JOIN asiento a ON a.id_estado = e.id_estado " +
            "GROUP BY e.state_name, e.state_type",
            nativeQuery = true)
    List<Object[]> obtenerPorcentajeEstadoXAsiento();

}

