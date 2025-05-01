package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Asiento;
import pe.edu.upc.pts.entities.Pago;
import pe.edu.upc.pts.entities.Usuario;

import java.math.BigDecimal;

public class Reserva_boletoDTO {
    private int idReservaBoleto;
    private BigDecimal ticketAmountReservaBoleto;
    private int seatQuantityReservaBoleto;
    private Usuario usuario;
    private Pago pago;
    private Asiento asiento;

    public int getIdReservaBoleto() {
        return idReservaBoleto;
    }

    public void setIdReservaBoleto(int idReservaBoleto) {
        this.idReservaBoleto = idReservaBoleto;
    }

    public BigDecimal getTicketAmountReservaBoleto() {
        return ticketAmountReservaBoleto;
    }

    public void setTicketAmountReservaBoleto(BigDecimal ticketAmountReservaBoleto) {
        this.ticketAmountReservaBoleto = ticketAmountReservaBoleto;
    }

    public int getSeatQuantityReservaBoleto() {
        return seatQuantityReservaBoleto;
    }

    public void setSeatQuantityReservaBoleto(int seatQuantityReservaBoleto) {
        this.seatQuantityReservaBoleto = seatQuantityReservaBoleto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
}
