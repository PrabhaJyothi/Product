package com.Example.ProducrtDemo.service;

import com.Example.ProducrtDemo.dto.Productdto;
import com.Example.ProducrtDemo.entity.Product;
import com.Example.ProducrtDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
   @Autowired
   private ProductRepository productRepository;
   public Productdto savedProduct(Productdto productdto){
       Product product= convertDtoToEntity(productdto);
       product = productRepository.save(product);
       return convertEntityToDto(product);

   }

   private Product convertDtoToEntity(Productdto productdto) {
       Product product = new Product();
       product.setName(productdto.getName());
       product.setDescription(productdto.getDescription());
       product.setPrice(productdto.getPrice());
       return product;

   }
   private Productdto convertEntityToDto(Product product){
       Productdto productdto = new Productdto();
       productdto.setName(product.getName());
       productdto.setDescription(product.getDescription());
       productdto.setPrice(product.getPrice());
       return productdto;
   }
}
