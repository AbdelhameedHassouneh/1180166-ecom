package com.example.ecommerce1180166.service.impl;

import com.example.ecommerce1180166.Repositry.SupplierRep;
import com.example.ecommerce1180166.dto.SupplierDto;
import com.example.ecommerce1180166.entity.Supplier;
import com.example.ecommerce1180166.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRep supplierRep;


    @Override
    public Supplier updateSupplier(Supplier updatedSupplier, long id)  {
        Supplier supplier =  supplierRep.findById(id);



        if(supplier != null){

            if (updatedSupplier.getName() != null)
                supplier.setName(updatedSupplier.getName());
            if (updatedSupplier.getEmail() != null)
                supplier.setEmail(updatedSupplier.getEmail());

        }

        return supplierRep.save(supplier);
    }

}
