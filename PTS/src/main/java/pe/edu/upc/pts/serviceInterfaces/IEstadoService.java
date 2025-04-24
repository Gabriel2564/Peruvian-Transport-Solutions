package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Estado;

import java.util.List;

public interface IEstadoService {
    public List<Estado> listar_estado();
    public void insert(Estado estado);
    List<Estado> list();
}
