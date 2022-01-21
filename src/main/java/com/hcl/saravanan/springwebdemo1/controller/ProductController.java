package com.hcl.saravanan.springwebdemo1.controller;

import com.hcl.saravanan.springwebdemo1.model.Product;
import com.hcl.saravanan.springwebdemo1.repo.ProductRepository;
import com.hcl.saravanan.springwebdemo1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/products/all")
    public List<Product> listProducts() {
        return service.listAllProducts();
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prd) {
        service.saveProduct(prd);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        service.deleteProductById(id);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@RequestBody Product prd, @PathVariable int id) {
        service.updateProductById(prd, id);
    }


}