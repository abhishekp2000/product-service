package com.example.productservice.controller;

import com.example.productservice.entity.Product;
import com.example.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Controller {
    @Autowired
    private ProductService productService;
    @RequestMapping("/product/customer/{customerId}")
    public List<Product> getProducts(@PathVariable long customerId){
        return this.productService.getProductOfCustomer(customerId);

    }

    @PostMapping("/product/addproduct")
    public Product addProduct(@RequestBody Product product1) {
        Product product = productService.addProduct(product1);

        return product;
    }

//   @DeleteMapping("/product/{custId}")
//
//    public String deleteEmployee(@PathVariable long custId) {
//
//        return productService.deleteproductbyId(custId);
//    }


}
