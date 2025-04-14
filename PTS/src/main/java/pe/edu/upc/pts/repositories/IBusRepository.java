package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Bus;

@Repository
public interface IBusRepository extends JpaRepository<Bus, Integer> {
}
