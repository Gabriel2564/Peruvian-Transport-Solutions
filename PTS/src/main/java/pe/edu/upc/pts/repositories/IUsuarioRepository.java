package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Usuario;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername(String username);

    @Query(value = "SELECT r.rol AS Rol, COUNT(*) AS QuantityUsers " +
            "FROM rol r INNER JOIN usuario u " +
            "ON r.id_usuario = u.id " +
            "GROUP BY r.rol", nativeQuery = true)
    List<String[]> QuantityUsuarioByRol();

    @Query("SELECT u FROM Usuario u WHERE u.id = :id")
    Optional<Usuario> findUsuarioById(@Param("id") int id);

}
