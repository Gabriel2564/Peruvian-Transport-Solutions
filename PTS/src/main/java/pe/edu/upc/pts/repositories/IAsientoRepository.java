package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Asiento;

@Repository
public interface IAsientoRepository extends JpaRepository<Asiento, Integer> {
    // Buscar asiento por número de asiento en un bus
    @Query("SELECT a FROM Asiento a WHERE a.seat_number = :seat_number AND a.bus.idBus = :busId")
    Asiento findByNumberAndBusId(@Param("seat_number") int seat_number, @Param("busId") int busId);

}
