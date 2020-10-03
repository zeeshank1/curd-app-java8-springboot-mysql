package com.kzish.springboot.curd.repository;

import com.kzish.springboot.curd.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
