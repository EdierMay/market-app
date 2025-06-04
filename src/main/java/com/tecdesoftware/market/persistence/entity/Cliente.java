package com.tecdesoftware.market.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table (name="clientes")

@OneToMany(mappedBy = "cliente")
private List <Compra> compras
public class Cliente {
    @Id //

    private String id;
    private String nombre;
    private String apellidos;
    private Long celular;
    private String direccion;
    @Column(name="correo_electronico")
    private String correoElectronico;
}
