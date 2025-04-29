package pe.edu.upc.pts.dtos;

import pe.edu.upc.pts.entities.Usuario;
import pe.edu.upc.pts.entities.Pago;
import pe.edu.upc.pts.entities.Asiento;

import java.math.BigDecimal;

public class Reserva_boletoDTO {

    private int idReservabol;
    private BigDecimal montoBoleto;
    private Boolean cantidadAsientos;
    private Usuario usuario;
    private Pago pago;
    private Asiento asiento;

    public Reserva_boletoDTO() {
    }

    public Reserva_boletoDTO(int idReservabol, BigDecimal montoBoleto, Boolean cantidadAsientos,
                             Usuario usuario, Pago pago, Asiento asiento) {
        this.idReservabol = idReservabol;
        this.montoBoleto = montoBoleto;
        this.cantidadAsientos = cantidadAsientos;
        this.usuario = usuario;
        this.pago = pago;
        this.asiento = asiento;
    }

    public int getIdReservabol() {
        return idReservabol;
    }

    public void setIdReservabol(int idReservabol) {
        this.idReservabol = idReservabol;
    }

    public BigDecimal getMontoBoleto() {
        return montoBoleto;
    }

    public void setMontoBoleto(BigDecimal montoBoleto) {
        this.montoBoleto = montoBoleto;
    }

    public Boolean getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(Boolean cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
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
