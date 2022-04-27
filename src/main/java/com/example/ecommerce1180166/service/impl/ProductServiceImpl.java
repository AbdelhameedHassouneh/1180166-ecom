package com.example.ecommerce1180166.service.impl;

import com.example.ecommerce1180166.Repositry.ProductRep;
import com.example.ecommerce1180166.entity.Product;
import com.example.ecommerce1180166.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl  {

    @Autowired
    ProductRep productRep;

    public List<Product> getAllProducts() {
        return productRep.findAll();

    }
}
