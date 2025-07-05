package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Bus;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IBusRepository extends JpaRepository<Bus, Integer> {
    @Query("SELECT b FROM Bus b WHERE b.idBus = :id")
    Optional<Bus> findByIdBus(@Param("id") int id);
}
