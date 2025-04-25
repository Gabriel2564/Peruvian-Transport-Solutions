package pe.edu.upc.pts.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Pago;

import java.util.List;


public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    @Query("SELECT p FROM Pago p WHERE p.paymentType = :paymentType")
    List<Pago> findByPaymentType(@Param("paymentType") String paymentType);

    @Query("SELECT p.paymentType, COUNT(p) FROM Pago p GROUP BY p.paymentType")
    List<Object[]> countPaymentsByType();

}
