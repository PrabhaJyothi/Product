package com.Example.ProducrtDemo.controller;

import com.Example.ProducrtDemo.dto.Productdto;
import com.Example.ProducrtDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

@Autowired
    private ProductService productService;

@PostMapping("/create")
    public ResponseEntity<Productdto> createProduct(@RequestBody Productdto productdto) {


    Productdto savedProductdto = productService.savedProduct(productdto);
    return ResponseEntity.ok(savedProductdto);

}
}
