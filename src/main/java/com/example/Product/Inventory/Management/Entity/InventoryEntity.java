package com.example.Product.Inventory.Management.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Inventory")
public class InventoryEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Product ID is required")
    private Long Id;

    @NotNull(message = "Quantity is required")
    @Min(value=0, message ="Quantity can not be null" )
    private int availableQuantity;
    private LocalDateTime lastUpdated;
//mapping
    @OneToOne
    @JoinColumn(name = "product_id",nullable = false,unique = true)
    private ProductEntity productEntity;

    public Long getProductId() {
        return Id;
    }

    public void setProductId(Long productId) {
        this.Id = productId;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }
}
