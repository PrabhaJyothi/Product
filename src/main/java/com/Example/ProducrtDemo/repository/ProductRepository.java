package com.Example.ProducrtDemo.repository;

import com.Example.ProducrtDemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
