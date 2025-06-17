package com.example.Product.Inventory.Management.Dto;

import com.example.Product.Inventory.Management.Entity.ProductEntity;
import com.example.Product.Inventory.Management.Repository.ProductRepo;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto
{

    @NotBlank(message = "PRODUCT NAME MUST NOT BE BLANK")
    @Size(min=4,message = "Description must not be blank")
    private String productName;

    private String productDescr;

    @Min(0)
    @Positive(message = "Price must not be zero")
    private double price;

    @NotBlank(message = "Category must not be blank")
    private String category;

    @NotBlank(message = "Unit must not be blank")
    private String unit;



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescr() {
        return productDescr;
    }

    public void setProductDescr(String productDescr) {
        this.productDescr = productDescr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
