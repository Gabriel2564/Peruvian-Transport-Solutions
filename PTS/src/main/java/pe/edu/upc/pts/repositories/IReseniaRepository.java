package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Resenia;

import java.util.List;


@Repository
public interface IReseniaRepository extends JpaRepository<Resenia, Integer> {
}
