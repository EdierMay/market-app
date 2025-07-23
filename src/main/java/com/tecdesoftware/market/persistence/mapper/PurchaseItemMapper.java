package com.tecdesoftware.market.persistence.mapper;

import com.tecdesoftware.market.domain.PurchaseItem;
import com.tecdesoftware.market.persistence.entity.CompraProducto;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses={ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProducto", target="productId"),
            @Mapping(source = "cantidad", target="quantity"),
            @Mapping(source = "estado", target="active")
            // el de total no es necesario mapearlo, ya que ambos se llaman igual
    })
    PurchaseItem toPurchaseItem(CompraProducto producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(source = "productId", target = "id.idProducto"),
            @Mapping(target="id.idCompra", ignore=true),
            @Mapping(target="compra", ignore=true),
            @Mapping(target="producto", ignore=true)
    })
    CompraProducto toCompraProducto(PurchaseItem item);

    default Producto createProductoFromId(int productId) {
        Producto producto = new Producto();
        producto.setIdProducto(productId);
        return producto;
    }
}
