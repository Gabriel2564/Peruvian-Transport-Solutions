package pe.edu.upc.pts.dtos;

import java.math.BigDecimal;

public class Reserva_boletoDTO {
    private int reservationId;
    private BigDecimal ticketAmount;
    private Boolean seatQuantity;
    private int userId;
    private int paymentId;
    private int seatId;

    public Reserva_boletoDTO() {
    }

    public Reserva_boletoDTO(int reservationId, BigDecimal ticketAmount, Boolean seatQuantity,
                             int userId, int paymentId, int seatId) {
        this.reservationId = reservationId;
        this.ticketAmount = ticketAmount;
        this.seatQuantity = seatQuantity;
        this.userId = userId;
        this.paymentId = paymentId;
        this.seatId = seatId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
}
