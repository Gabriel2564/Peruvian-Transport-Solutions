package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Viaje;

import java.util.List;

@Repository
public interface IViajeRepository extends JpaRepository<Viaje, Integer> {
    @Query(value = "select r.location as Ruta ,count(*) as QuantityViaje\n" +
            "from Ruta r inner join Viaje v\n" +
            "on r.id_ruta=v.id_ruta\n" +
            "group by r.location",nativeQuery = true)
    List<String[]> QuantityViajeByRuta();
}
