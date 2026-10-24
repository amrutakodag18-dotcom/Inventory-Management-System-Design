package com.inventory.dao;

import com.inventory.model.Product;
import java.util.List;

public interface ProductDAO {
    void addProduct(Product product);
    Product getProductById(int id);
    List<Product> getAllProducts();
    void updateStock(int productId, int quantity);
}