package com.guilherme.rest_api.services;

import com.guilherme.rest_api.entity.Category;
import com.guilherme.rest_api.entity.Product;
import com.guilherme.rest_api.repositories.CategoryRepository;
import com.guilherme.rest_api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
