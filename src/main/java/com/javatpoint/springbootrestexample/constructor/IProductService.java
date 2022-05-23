package com.javatpoint.springbootrestexample.constructor;

import com.javatpoint.springbootrestexample.model.Product;

import java.util.List;

public interface IProductService {
    List <Product> findAll();
}
