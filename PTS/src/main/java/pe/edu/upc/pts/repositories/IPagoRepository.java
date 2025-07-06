package pe.edu.upc.pts.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Pago;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    @Query("SELECT p FROM Pago p WHERE p.paymentTypePago = :paymentTypePago")
    List<Pago> findByPaymentType(@Param("paymentTypePago") String paymentType);

    @Query("SELECT p.paymentTypePago, COUNT(p) FROM Pago p GROUP BY p.paymentTypePago")
    List<String[]> countPaymentsByType();

    @Query("SELECT p FROM Pago p WHERE p.idPago = :id")
    Optional<Pago> findByIdPago(@Param("id") int id);
}
