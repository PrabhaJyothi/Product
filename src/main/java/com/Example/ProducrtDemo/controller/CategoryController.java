package com.Example.ProducrtDemo.controller;

import com.Example.ProducrtDemo.dto.Categorydto;
import com.Example.ProducrtDemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @PostMapping
    public ResponseEntity<Categorydto> addCategory(@RequestBody Categorydto categoryDto) {
        Categorydto createdCategory = categoryService.addCategory(categoryDto);
        return ResponseEntity.ok(createdCategory);
    }

}
