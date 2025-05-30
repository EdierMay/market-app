package com.tecdesoftware.market.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name="categprias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;
    private String description;
    private Boolean estado;
}
