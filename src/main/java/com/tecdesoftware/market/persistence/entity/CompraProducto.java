package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name="compras_productos")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;
    private Integer cantidad;
    private Double total;
    private boolean estado;

    @ManyToOne
    @JoinColumn(name="id_compra", insertable = false, updatable = false)
    private Compra compra;

    ManyToMany
    @JoinColumn(name="id_producto", insertable = false, updatable = false)
    private Cliente cliente;

    OneToMany(mappedBy = "producto")

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
