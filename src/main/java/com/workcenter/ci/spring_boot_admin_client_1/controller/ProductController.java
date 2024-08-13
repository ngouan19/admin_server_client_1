package com.workcenter.ci.spring_boot_admin_client_1.controller;


import com.workcenter.ci.spring_boot_admin_client_1.model.Product;
import com.workcenter.ci.spring_boot_admin_client_1.reposity.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }
}
