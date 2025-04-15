package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Bus;

import java.util.List;

public interface IBusService {
    public List<Bus> list();
    public void insert(Bus bus);
    public void update(Bus bus);
    public void delete(int id);
}
