package pe.edu.upc.pts.serviceInterfaces;

import pe.edu.upc.pts.entities.Reserva_boleto;

import java.util.List;

public interface IReserva_boletoService {
    List<Reserva_boleto> list();
    void insert(Reserva_boleto reserva);
    void update(Reserva_boleto reserva);
    void delete(int id);
    public Reserva_boleto findById(int id);
}
