package com.tecdesoftware.market.persistence.entity;
//HOLA
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "compras")
public class Compras {

    @Id
    //valor único
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")

    private Integer idCompra;

    @Column(name = "codigo_cliente")
    private String id_Cliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;
    private String estado;
}



