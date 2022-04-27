package com.example.ecommerce1180166.service;

import com.example.ecommerce1180166.dto.SupplierDto;
import com.example.ecommerce1180166.entity.Supplier;

public interface SupplierService {

    Supplier updateSupplier(Supplier supplier, long id);

}
