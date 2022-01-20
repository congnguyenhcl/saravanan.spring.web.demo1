package com.hcl.saravanan.springwebdemo1.repo;

import com.hcl.saravanan.springwebdemo1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
