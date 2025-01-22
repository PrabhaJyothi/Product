package com.Example.ProducrtDemo.dto;

import jakarta.validation.constraints.*;

public class Productdto {
    @NotBlank(message ="Product name must be required")
    @Size(min=2,max=100,message="Product name must be between 2 and 100 characters")
    private String name;

    @NotNull(message ="Product price is required")
    @Positive(message ="Price must be a positive number")
    @DecimalMin(value="0.1",message="Price must be greater than or equal to 0")
    private double price;

    @NotBlank(message="Description must be required")
    @Size(min=2,max=500,message="Description must be between 2 and 500 characters")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
