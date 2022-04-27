package com.example.ecommerce1180166.service.impl;

import com.example.ecommerce1180166.Repositry.CustomerRep;
import com.example.ecommerce1180166.dto.CustomerDto;
import com.example.ecommerce1180166.entity.Customer;
import com.example.ecommerce1180166.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRep customerRep;

    @Override
    public Customer createCustomer( Customer customer)  {
        String email = null;
        System.out.println("reached 2");
        System.out.println("reached");

        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if(customer.getEmail() != null) {
            email = customer.getEmail().toLowerCase();

        }

        customerRep.save(customer);
        return customer;
    }
}
