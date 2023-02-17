package com.example.productservice.service;

import com.example.productservice.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductImpl implements ProductService{
    List<Product> productList=new ArrayList<>();

    @Override
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    // List of Products
   /* List<Product> productList=List.of(
            new Product(101,"Mobile",12000,1224),
            new Product(102,"Fridge",20000,1236),
            new Product(103,"Shoes",10000,1248)

    );*/
    @Override
    public List<Product> getProductOfCustomer(long customerId) {
         return this.productList.stream().filter(product -> product.getCustomerId()==(customerId)).collect(Collectors.toList());
    }

 /*   @Override
    public String deleteproductbyId(long customerId) {
        Product product=null;
        for (Product prodObj : productList) {
            if (prodObj.getCustomerId() == customerId) {
                product = prodObj;
                productList.remove(prodObj);
                break;
            }

        }
        return "product deleted ";
    }*/


}
