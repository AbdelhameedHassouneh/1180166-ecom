package com.example.ecommerce1180166.Repositry;

import com.example.ecommerce1180166.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ProductRep extends JpaRepository<Product,Long> {


}
