package com.Example.ProducrtDemo.service;

import com.Example.ProducrtDemo.dto.Categorydto;
import com.Example.ProducrtDemo.entity.Category;
import com.Example.ProducrtDemo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    // Add a new category
    public Categorydto addCategory(Categorydto categoryDto) {
        Category category = convertDtoToEntity(categoryDto);
        category = categoryRepository.save(category);
        return convertEntityToDto(category);

    }


    private Category convertDtoToEntity(Categorydto categoryDto) {
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCategory_name(categoryDto.getCategory_name());
        return category;
    }

    private Categorydto convertEntityToDto(Category category) {
        Categorydto categoryDto = new Categorydto();
        categoryDto.setId(category.getId());
        categoryDto.setCategory_name(category.getCategory_name());
        return categoryDto;
    }
}


