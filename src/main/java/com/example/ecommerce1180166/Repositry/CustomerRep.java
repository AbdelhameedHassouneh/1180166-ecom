package com.example.ecommerce1180166.Repositry;

import com.example.ecommerce1180166.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends JpaRepository<Customer,Long> {


}
