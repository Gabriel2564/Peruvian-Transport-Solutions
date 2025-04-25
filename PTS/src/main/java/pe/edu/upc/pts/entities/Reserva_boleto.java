package pe.edu.upc.pts.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "reserva_boleto")
public class Reserva_boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationId;

    @Column(name = "monto_boleto", nullable = false)
    private BigDecimal ticketAmount;

    @Column(name = "cantidad_asientos", nullable = false)
    private Boolean seatQuantity;

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario", nullable = false)
    private Usuario user;

    @ManyToOne
    @JoinColumn(name = "pago_id_pago", nullable = false)
    private Pago payment;

    @ManyToOne
    @JoinColumn(name = "asiento_id_asient", nullable = false)
    private Asiento seat;

    public Reserva_boleto() {
    }

    public Reserva_boleto(int reservationId, BigDecimal ticketAmount, Boolean seatQuantity,
                          Usuario user, Pago payment, Asiento seat) {
        this.reservationId = reservationId;
        this.ticketAmount = ticketAmount;
        this.seatQuantity = seatQuantity;
        this.user = user;
        this.payment = payment;
        this.seat = seat;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public BigDecimal getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(BigDecimal ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public Boolean getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(Boolean seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Pago getPayment() {
        return payment;
    }

    public void setPayment(Pago payment) {
        this.payment = payment;
    }

    public Asiento getSeat() {
        return seat;
    }

    public void setSeat(Asiento seat) {
        this.seat = seat;
    }
}
