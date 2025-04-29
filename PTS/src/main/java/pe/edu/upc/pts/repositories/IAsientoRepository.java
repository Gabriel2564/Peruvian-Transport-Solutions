package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Asiento;

@Repository
public interface IAsientoRepository extends JpaRepository<Asiento, Integer> {
}
