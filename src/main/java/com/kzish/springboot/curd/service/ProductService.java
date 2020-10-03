package com.kzish.springboot.curd.service;

import com.kzish.springboot.curd.entity.Product;
import com.kzish.springboot.curd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> productList){
        return productRepository.saveAll(productList);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "Product deleted !! "+ id;
    }

    public Product updateProduct(Product product){
        Product existingProduct = productRepository.findAllById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        return null;
    }
}
