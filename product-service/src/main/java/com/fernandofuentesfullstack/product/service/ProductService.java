package com.fernandofuentesfullstack.product.service;

import com.fernandofuentesfullstack.product.entity.Category;
import com.fernandofuentesfullstack.product.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProduct();

    Product getProduct(Long id);

    Product createProduct(Product product);

    Product updateProduct(Product product);

    Product deleteProduct(Long id);

    List<Product> findByCategory(Category category);

    Product updateStock(Long id, Double quantity);

}
