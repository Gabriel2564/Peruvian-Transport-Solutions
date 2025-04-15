package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Tipo;

import java.util.List;

public interface ITipoService {
    public List<Tipo> list();
    public void insert( Tipo tipo);
}
