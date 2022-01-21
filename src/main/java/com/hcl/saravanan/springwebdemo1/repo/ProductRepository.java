package com.hcl.saravanan.springwebdemo1.repo;

import com.hcl.saravanan.springwebdemo1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
