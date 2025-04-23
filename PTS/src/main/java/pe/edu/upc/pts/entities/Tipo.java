package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipo")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_tipo;
    @Column(name = "n_tipo",nullable = false)
    int n_tipo;
    public Tipo() {

    }

    public Tipo(int id_tipo, int n_tipo) {
        this.id_tipo = id_tipo;
        this.n_tipo = n_tipo;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getN_tipo() {
        return n_tipo;
    }

    public void setN_tipo(int n_tipo) {
        this.n_tipo = n_tipo;
    }
}
