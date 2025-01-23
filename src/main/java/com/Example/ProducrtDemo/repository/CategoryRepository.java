package com.Example.ProducrtDemo.repository;

import com.Example.ProducrtDemo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface CategoryRepository extends JpaRepository<Category,Integer>
    {
    }
