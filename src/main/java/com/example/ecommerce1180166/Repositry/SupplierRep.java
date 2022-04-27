package com.example.ecommerce1180166.Repositry;

import com.example.ecommerce1180166.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRep extends JpaRepository<Supplier,Long> {
    Supplier findById(long id) ;



}
