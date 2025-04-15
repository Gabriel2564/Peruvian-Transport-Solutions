package pe.edu.upc.pts.dtos;

import jakarta.persistence.Column;

public class TipoDTO {
    int id_tipo;
    int n_tipo;

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
