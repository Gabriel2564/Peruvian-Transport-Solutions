package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Estado;

import java.util.List;

public interface IEstadoService {
    public List<Estado> list();
    public void insert(Estado estado);
    public void update(Estado estado);
    public void delete(int id);
}
