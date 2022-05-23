package com.javatpoint.springbootrestexample.constructor;

import com.javatpoint.springbootrestexample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductConstractor {

    @Autowired
    private IProductService productService;

    //mapping the getProduct() method to /product
    @GetMapping(value = "/product")
    public List<Product> getProduct() {
//finds all the products
        List<Product> products = productService.findAll();
//returns the product list
        return products;
    }
}