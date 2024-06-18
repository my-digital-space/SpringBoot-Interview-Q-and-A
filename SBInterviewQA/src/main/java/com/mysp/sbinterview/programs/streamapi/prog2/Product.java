package com.mysp.sbinterview.programs.streamapi.prog2;

import java.math.BigDecimal;

public class Product {

    private Integer id;
    private BigDecimal price;
    private Integer inventoryCount;

    public Product(Integer id, BigDecimal price, Integer inventoryCount) {
        this.id = id;
        this.price = price;
        this.inventoryCount = inventoryCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(Integer inventoryCount) {
        this.inventoryCount = inventoryCount;
    }
}
