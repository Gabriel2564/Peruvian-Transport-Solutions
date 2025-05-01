package pe.edu.upc.pts.dtos;

public class PagoDTO {
    private int idPago;
    private String paymentTypePago;

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
