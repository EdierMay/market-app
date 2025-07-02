package com.tecdesoftware.market.persistence.entity;


import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name="categprias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Integer idCategoria;

    private String description;
    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List <Producto> productos;


    @OneToOne
    @JoinColumn(name="id categoria", instertable = false, updatable = false)
    public Integer getIdCategoria (){
        return IdCategoria;
    }


}
