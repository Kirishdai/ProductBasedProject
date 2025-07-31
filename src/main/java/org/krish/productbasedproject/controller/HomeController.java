package org.krish.productbasedproject.controller;

import jakarta.websocket.server.PathParam;
import org.krish.productbasedproject.model.Product;
import org.krish.productbasedproject.repository.ProductRepo;
import org.krish.productbasedproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/allProducts")
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products = productService.getAllProducts();
        return products;
    }
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
    @PostMapping("/addProduct")
    public Product addProduct(@ModelAttribute Product product) {
        return productService.addProduct(product);
    }


}
