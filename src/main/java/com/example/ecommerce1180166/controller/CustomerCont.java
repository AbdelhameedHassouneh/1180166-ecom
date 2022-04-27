package com.example.ecommerce1180166.controller;


import com.example.ecommerce1180166.dto.CustomerDto;
import com.example.ecommerce1180166.entity.Customer;
import com.example.ecommerce1180166.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class CustomerCont {
    @Autowired
    CustomerServiceImpl customerService;


    @PostMapping(path = "/registerCustomer")
    public ResponseEntity<String> registerCustomer(@RequestBody Customer customer) {
        System.out.println("reached1");


        customerService.createCustomer(customer);

        return new ResponseEntity<>("logged in", HttpStatus.OK);
    }




}
