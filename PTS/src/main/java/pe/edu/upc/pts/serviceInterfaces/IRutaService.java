package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Ruta;

import java.util.List;

public interface IRutaService {
    public List<Ruta> list();
    public void insert(Ruta ruta);
    public void update(Ruta ruta);
    public void delete(int id);
}
