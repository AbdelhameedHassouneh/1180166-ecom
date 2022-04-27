package com.example.ecommerce1180166.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private Long id;
    private String email;
    private String name;

    public CustomerDto(Long id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }
}
