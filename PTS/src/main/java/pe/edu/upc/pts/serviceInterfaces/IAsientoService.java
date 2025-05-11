package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Asiento;

import java.util.List;

public interface IAsientoService {
    public List<Asiento> list();
    public void insert(Asiento asiento);
    public void update(Asiento asiento);
    public void delete(int id);
    public Asiento findById(int id);
}
