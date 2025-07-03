package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Viaje;

import java.util.List;

public interface IViajeService {
    public List<Viaje> list();
    public void insert(Viaje viaje);
    public void update(Viaje viaje);
    public void delete(int idRol);

    public List<String[]> QuantityViajeByRuta();
    public Viaje findById(int id);
}
