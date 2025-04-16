package pe.edu.upc.peruviantransportsolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.peruviantransportsolutions.entities.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {
}

