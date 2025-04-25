package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Asiento;

import java.util.List;

public interface IAsientoService {
    public List<Asiento> listar_asiento();
    public void insert(Asiento asiento);
    public void update(Asiento asiento);
    public void delete(int id);

    List<Asiento> list();


}
