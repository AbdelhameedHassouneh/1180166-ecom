package com.example.ecommerce1180166.controller;


import com.example.ecommerce1180166.entity.Product;
import com.example.ecommerce1180166.service.ProductService;
import com.example.ecommerce1180166.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductCont {

    @Autowired
    ProductServiceImpl productService;


    @GetMapping("/getProducts")
    public ResponseEntity<List<Product>> getAllProducts() {

        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);

    }
}
