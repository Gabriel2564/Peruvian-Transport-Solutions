package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.pts.entities.Pago;

public interface IPagoRepository extends JpaRepository<Pago, Integer> {
}
