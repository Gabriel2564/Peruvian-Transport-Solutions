package pe.edu.upc.pts.dtos;

public class QuantityUserByRolDTO {
    private String rol;
    private int total_usuarios;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getTotal_usuarios() {
        return total_usuarios;
    }

    public void setTotal_usuarios(int total_usuarios) {
        this.total_usuarios = total_usuarios;
    }
}
