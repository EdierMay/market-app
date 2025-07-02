package com.tecdesoftware.market.domain.repository;

import com.tecdesoftware.market.domain.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {

    public interface productRepository {

        List<Product> getAll();
        Optional<List<Product>> getByCategory(int categoryId);
        Optional<List<Product>> getScarceProducts(int quantity);
        Optional<Product> getProduct(int productId);
        Product save(Product product);
        void delete(int productId);
    }
}
