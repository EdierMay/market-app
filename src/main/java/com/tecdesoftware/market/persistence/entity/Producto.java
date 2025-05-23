package com.tecdesoftware.market.persistence.entity;
//HOLA
import jakarta.persistence.*;

@Entity
@Table (name = "productos")
public class Producto {

    @Id
    //valor único
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id producto")


    private  Integer IdProducto;

    private String nombre;

    @Column (name = "id categoria")
    private Integer idCategoria;


}
