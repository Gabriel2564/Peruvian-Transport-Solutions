package pe.edu.upc.pts.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Item_usuario")
public class Item_usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idItemUsuario;

    @Column(name = "travelQualificationItemUsuario",nullable = false)
    private int travelQualificationItemUsuario;

    @Column(name = "travelDateItemUsuario",nullable = false)
    private LocalDate travelDateItemUsuario;

    @ManyToOne
    @JoinColumn(name="idItem")
    private Item item;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public Item_usuario() {
    }

    public Item_usuario(int idItemUsuario, int travelQualificationItemUsuario, LocalDate travelDateItemUsuario, Item item, Usuario usuario) {
        this.idItemUsuario = idItemUsuario;
        this.travelQualificationItemUsuario = travelQualificationItemUsuario;
        this.travelDateItemUsuario = travelDateItemUsuario;
        this.item = item;
        this.usuario = usuario;
    }

    public int getIdItemUsuario() {
        return idItemUsuario;
    }

    public void setIdItemUsuario(int idItemUsuario) {
        this.idItemUsuario = idItemUsuario;
    }

    public int getTravelQualificationItemUsuario() {
        return travelQualificationItemUsuario;
    }

    public void setTravelQualificationItemUsuario(int travelQualificationItemUsuario) {
        this.travelQualificationItemUsuario = travelQualificationItemUsuario;
    }

    public LocalDate getTravelDateItemUsuario() {
        return travelDateItemUsuario;
    }

    public void setTravelDateItemUsuario(LocalDate travelDateItemUsuario) {
        this.travelDateItemUsuario = travelDateItemUsuario;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
