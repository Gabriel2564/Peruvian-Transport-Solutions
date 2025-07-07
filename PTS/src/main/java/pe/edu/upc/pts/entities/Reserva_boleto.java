package pe.edu.upc.pts.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "reserva_boleto")
public class Reserva_boleto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservaBoleto;

    @Column(name = "ticketAmountReservaBoleto", nullable = false)
    private BigDecimal ticketAmountReservaBoleto;

    @Column(name = "seatQuantityReservaBoleto", nullable = false)
    private int seatQuantityReservaBoleto;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuarios usuario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPago", nullable = false)
    private Pago pago;;

    @ManyToOne
    @JoinColumn(name = "idAsiento", nullable = false)
    private Asiento asiento;

    public Reserva_boleto() {
    }

    public Reserva_boleto(int idReservaBoleto, BigDecimal ticketAmountReservaBoleto, int seatQuantityReservaBoleto, Usuarios usuario, Pago pago, Asiento asiento) {
        this.idReservaBoleto = idReservaBoleto;
        this.ticketAmountReservaBoleto = ticketAmountReservaBoleto;
        this.seatQuantityReservaBoleto = seatQuantityReservaBoleto;
        this.usuario = usuario;
        this.pago = pago;
        this.asiento = asiento;
    }

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

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
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
