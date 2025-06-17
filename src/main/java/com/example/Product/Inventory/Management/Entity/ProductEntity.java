package com.example.Product.Inventory.Management.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.aspectj.bridge.Message;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Product")
public class ProductEntity
{

        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Id
        private long productID;

        @NotBlank(message = "PRODUCT NAME MUST NOT BE BLANK")
        @Size(min=4,message = "Description must not be blank")
        private String productName;

        private String productDescr;

        @Min(value=0,message = "price must be positive")
        @Positive(message = "Price must not be zero")
        private double price;

        @NotBlank(message = "Category must not be blank")
        private String category;

       @NotBlank(message = "Unit must not be blank")
        private String unit;



        public long getProductID() {
                return productID;
        }

        public void setProductID(long productID) {
                this.productID = productID;
        }

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
