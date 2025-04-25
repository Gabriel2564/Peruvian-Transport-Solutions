package pe.edu.upc.pts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pts.entities.Item_usuario;

@Repository
public interface IItem_usuarioRepository extends JpaRepository<Item_usuario, Integer> {
}
