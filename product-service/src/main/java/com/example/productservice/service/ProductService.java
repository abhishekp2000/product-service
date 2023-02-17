package com.example.productservice.service;

import com.example.productservice.entity.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    public List<Product> getProductOfCustomer(long customerId);
  // public String deleteproductbyId(long cusomerId);
}
