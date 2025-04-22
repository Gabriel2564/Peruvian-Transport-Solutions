package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;

    @Column(name = "tipo_pa", length = 100, nullable = false)
    private String tipoPa;

    public Pago() {
    }

    public Pago(String tipoPa) {
        this.tipoPa = tipoPa;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getTipoPa() {
        return tipoPa;
    }

    public void setTipoPa(String tipoPa) {
        this.tipoPa = tipoPa;
    }
}
