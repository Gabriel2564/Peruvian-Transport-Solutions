package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Reserva_boleto;

@Repository
public interface IReserva_boletoRepository extends JpaRepository<Reserva_boleto, Integer> {
}

