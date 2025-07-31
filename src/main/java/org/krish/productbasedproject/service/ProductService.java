package org.krish.productbasedproject.service;

import org.krish.productbasedproject.model.Product;
import org.krish.productbasedproject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products = productRepo.findAll();
        return products;
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
}
