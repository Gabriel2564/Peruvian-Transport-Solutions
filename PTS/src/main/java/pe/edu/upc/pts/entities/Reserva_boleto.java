package pe.edu.upc.pts.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "reserva_boleto")
public class Reserva_boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservabol;

    @Column(name = "monto_boleto", nullable = false)
    private BigDecimal montoBoleto;

    @Column(name = "cantidad_asientos", nullable = false)
    private Boolean cantidadAsientos;

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "pago_id_pago", nullable = false)
    private Pago pago;

    @ManyToOne
    @JoinColumn(name = "asiento_id_asient", nullable = false)
    private Asiento asiento;

    public Reserva_boleto() {
    }

    public Reserva_boleto(int idReservabol, BigDecimal montoBoleto, Boolean cantidadAsientos,
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
