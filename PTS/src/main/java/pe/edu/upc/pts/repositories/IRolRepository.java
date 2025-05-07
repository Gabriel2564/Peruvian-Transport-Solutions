package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Rol;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    @Query(value = "SELECT r.rol, COUNT(u.id) AS total_usuarios\n" +
            "FROM rol r\n" +
            "JOIN usuario u ON r.id_usuario = u.id\n" +
            "GROUP BY r.rol;", nativeQuery = true)
    List<String[]> quantityUserByRol();
}
