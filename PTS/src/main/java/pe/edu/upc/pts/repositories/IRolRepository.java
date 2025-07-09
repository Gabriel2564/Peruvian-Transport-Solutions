package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Role;

import java.util.List;
import java.util.Optional;

@Repository
public interface IRolRepository extends JpaRepository<Role, Long> {
    @Query(value = "SELECT r.rol AS Rol, COUNT(u.id_Usuario) AS QuantityUsers " +
            "FROM roles r " +
            "INNER JOIN usuarios u ON r.id = u.role_id " +
            "GROUP BY r.id", nativeQuery = true)
    List<String[]> quantityUserByRol();

    @Query("SELECT r FROM Role r WHERE r.id = :id")
    Optional<Role> findRolById(@Param("id") Long id);
}
