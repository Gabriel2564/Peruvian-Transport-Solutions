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

    @Query(value = "select r.name_rol as Rol ,count(*) as QuantityUsers\n" +
            "from Rol r inner join Usuario u\n" +
            "on r.id_rol=u.id_rol\n" +
            "group by r.name_rol",nativeQuery = true)
    List<String[]> QuantityUsuarioByRol();

    @Query("SELECT u FROM Usuario u WHERE u.id = :id")
    Optional<Usuario> findUsuarioById(@Param("id") int id);

}
