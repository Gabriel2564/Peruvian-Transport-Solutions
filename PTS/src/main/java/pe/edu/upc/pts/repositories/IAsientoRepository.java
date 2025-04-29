package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Asiento;

import java.util.List;

@Repository
public interface IAsientoRepository extends JpaRepository<Asiento, Integer> {

    @Query("SELECT a FROM Asiento a WHERE a.seat_number = :seat")
    public List<Asiento> buscarPorNumeroAsiento(@Param("seat") int seat);

    // Buscar asiento por número de asiento en un bus
    @Query("SELECT a FROM Asiento a WHERE a.seat_number = :seat_number AND a.bus.idBus = :busId")
    Asiento findByNumberAndBusId(@Param("seat_number") int seat_number, @Param("busId") int busId);

    @Query(value = "SELECT a.id_bus, COUNT(a.id_asiento) AS cantidad_asientos " +
            "FROM asiento a GROUP BY a.id_bus",
            nativeQuery = true)
    List<String[]> quantitySeatByBus();

}
