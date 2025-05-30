package com.tecdesoftware.market.persistence.entity;
//HOLA
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

@Table (name="compras")

public class Compras {

    @Id//Llave primaria
    //Hace el ID autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_compra")
    private Integer idCompra;

    private String nombre;
    @Column(name="id_cliente")
    private Integer idCategoria;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private Double medioPago;


    private Integer comentario;

    private Boolean estado;

}