package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory {
    private int id;
    private String name;
    private String department;
    private String description;

    private static int ID_COUNTER = 0;

    public ProductCategory() {
        this.id = ID_COUNTER++;
    }

    public ProductCategory(String name, String department, String description) {
        this();
        this.name = name;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
        return String.format("[id:%d, name:%s, department:%s, description:%s]",
                this.id,
                this.name,
                this.department,
                this.description);
    }
}
