package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Viaje;

import java.util.List;

public interface IViajeService {
    public void insert(Viaje viaje);

    public List<Viaje> list();

    public void delete(int idRol);

}
