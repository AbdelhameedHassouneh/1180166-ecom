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


    @PostMapping(path = "/registerClient")
    public ResponseEntity<String> registerClient(@RequestBody CustomerDto customerDto) {
        System.out.println("reached1");
        Customer customer = new Customer();


        customer.setEmail(customerDto.getEmail());
        customer.setName(customerDto.getName());
        customer.setId(customerDto.getId());


        customerService.createCustomer(customer);

        return new ResponseEntity<>("logged in", HttpStatus.OK);
    }




}
