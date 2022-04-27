package com.example.ecommerce1180166.controller;


import com.example.ecommerce1180166.dto.SupplierDto;
import com.example.ecommerce1180166.entity.Supplier;
import com.example.ecommerce1180166.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierCont {

    @Autowired
    SupplierServiceImpl supplierService;

    @PutMapping("/update")
    public Supplier updateUser(@RequestBody Supplier supplier) {

        return supplierService.updateSupplier(supplier,supplier.getId());

    }
}
