package pe.edu.upc.pts.dtos;

import java.math.BigDecimal;

public class Reserva_boletoDTO {
    private int idReservabol;
    private BigDecimal montoBoleto;
    private Boolean cantidadAsientos;
    private int usuarioId;
    private int pagoId;
    private int asientoId;

    public Reserva_boletoDTO() {
    }

    public Reserva_boletoDTO(int idReservabol, BigDecimal montoBoleto, Boolean cantidadAsientos,
                             int usuarioId, int pagoId, int asientoId) {
        this.idReservabol = idReservabol;
        this.montoBoleto = montoBoleto;
        this.cantidadAsientos = cantidadAsientos;
        this.usuarioId = usuarioId;
        this.pagoId = pagoId;
        this.asientoId = asientoId;
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

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getPagoId() {
        return pagoId;
    }

    public void setPagoId(int pagoId) {
        this.pagoId = pagoId;
    }

    public int getAsientoId() {
        return asientoId;
    }

    public void setAsientoId(int asientoId) {
        this.asientoId = asientoId;
    }
}

