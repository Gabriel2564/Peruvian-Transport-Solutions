package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Reserva_boleto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface IReserva_boletoRepository extends JpaRepository<Reserva_boleto, Integer> {
    // Encuentra reservas por monto mayor a un valor específico
    @Query("SELECT r FROM Reserva_boleto r WHERE r.ticketAmountReservaBoleto > :amount")
    List<Reserva_boleto> findByTicketAmountGreaterThan(@Param("amount") BigDecimal amount);

    @Query("SELECT rb FROM Reserva_boleto rb WHERE rb.idReservaBoleto = :id")
    Optional<Reserva_boleto> findByIdReservaBoleto(@Param("id") int id);
}
