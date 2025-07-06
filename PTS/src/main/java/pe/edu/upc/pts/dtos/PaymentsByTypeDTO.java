package pe.edu.upc.pts.dtos;

public class PaymentsByTypeDTO {
    private int total;
    private String tipoPago;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
}
