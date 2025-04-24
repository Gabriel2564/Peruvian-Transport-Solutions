package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}
