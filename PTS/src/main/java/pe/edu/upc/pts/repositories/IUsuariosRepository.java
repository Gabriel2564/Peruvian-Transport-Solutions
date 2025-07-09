package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Usuarios;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer> {
    public Usuarios findOneByUsername(String username);


    @Query("SELECT u FROM Usuarios u WHERE u.idUsuario = :id")
    Optional<Usuarios> findUsuarioById(@Param("id") int id);

}
