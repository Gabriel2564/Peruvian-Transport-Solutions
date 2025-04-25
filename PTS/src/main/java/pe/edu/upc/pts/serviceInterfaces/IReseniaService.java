package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Resenia;

import java.util.List;

public interface IReseniaService {
    public List<Resenia> list();
    public void insert( Resenia resenia);
}
