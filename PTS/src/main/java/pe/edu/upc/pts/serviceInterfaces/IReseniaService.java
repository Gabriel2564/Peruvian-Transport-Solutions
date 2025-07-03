package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Resenia;

import java.util.List;

public interface IReseniaService {
    public List<Resenia> list();
    public void insert( Resenia resenia);
    public void update( Resenia resenia);
    public void delete(int id);
    public List<String[]> QuantityReseniaByUsuario();
    public Resenia findById(int id);
}
