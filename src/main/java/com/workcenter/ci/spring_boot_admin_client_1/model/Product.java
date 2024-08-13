package com.workcenter.ci.spring_boot_admin_client_1.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "products")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}
