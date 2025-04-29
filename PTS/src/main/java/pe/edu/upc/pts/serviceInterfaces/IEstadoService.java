package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.dtos.PorcentajeEstadoXAsientoDTO;
import pe.edu.upc.pts.entities.Bus;
import pe.edu.upc.pts.entities.Estado;

import java.util.List;

public interface IEstadoService {
    public List<Estado> listar_estado();
    public void insert(Estado estado);
    public void update(Estado estado);
    public void delete(int id);

    List<PorcentajeEstadoXAsientoDTO> listarPorcentajeEstadoAsiento();
    List<Estado> list();
}
