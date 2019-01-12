package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {
    private int id;
    private String name;
    private String description;

    private static int ID_COUNTER = 0;

    public Supplier() {
        this.id = ID_COUNTER++;
    }

    public Supplier(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    @Override
    public String toString() {
        return String.format("[id:%d, name:%s, description:%s]",
                this.id,
                this.name,
                this.description);
    }
}
