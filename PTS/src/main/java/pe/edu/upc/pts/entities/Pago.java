package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;

    @Column(name = "paymentTypePago", length = 100, nullable = false)
    private String paymentTypePago;

    public Pago() {
    }

    public Pago(int idPago, String paymentTypePago) {
        this.idPago = idPago;
        this.paymentTypePago = paymentTypePago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getPaymentTypePago() {
        return paymentTypePago;
    }

    public void setPaymentTypePago(String paymentTypePago) {
        this.paymentTypePago = paymentTypePago;
    }
}
