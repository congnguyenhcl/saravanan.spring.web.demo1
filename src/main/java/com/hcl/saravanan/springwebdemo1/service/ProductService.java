package com.hcl.saravanan.springwebdemo1.service;

import com.hcl.saravanan.springwebdemo1.model.Product;
import com.hcl.saravanan.springwebdemo1.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> listAllProducts() {
        return repo.findAll();
    }

    public void saveProduct(Product prd) {
        repo.save(prd);
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteProductById(int id) {
        repo.deleteById(id);
    }

    public void updateProductById(Product prd, int id) {
        Product tempPrd = repo.findById(id).get();
        tempPrd.setPrdPrice(prd.getPrdPrice());
        tempPrd.setPrdName(prd.getPrdName());
        repo.save(tempPrd);
    }
}

