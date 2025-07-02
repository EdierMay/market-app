package com.tecdesoftware.market.persistence.crud;

import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//metodos abstractos que en otras clases se implementaran mejor
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
     //querymetodo


    List<Producto> findByIdCategoriaOrderByNombreAsc (int idCategoria);

    public List<Producto> getByCategoriaByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
