package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Tipo;
@Repository
public interface ITipoRepository extends JpaRepository<Tipo, Integer> {
}
