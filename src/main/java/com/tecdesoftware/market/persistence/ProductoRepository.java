package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>)productoCrudRepository.findAll();
    }
    public List<Producto> getByCategoria(int idCategoria) {
        return CrudRepository.findByCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, estado: true);
    }

    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findId(idProducto);
    }

    public Produducto save (Producto producto) {
        return productoCrudRepository.save(producto);
        }

    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }





}
