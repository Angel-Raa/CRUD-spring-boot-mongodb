package com.github.AngelRaa.modules.entity.repository;

import com.github.AngelRaa.modules.entity.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByName(String name);
    void deleteByName(String name);
    List<Product> findAllProductsByName(String name);

    
}
