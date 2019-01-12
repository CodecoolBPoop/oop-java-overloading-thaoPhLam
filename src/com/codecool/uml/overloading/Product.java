package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;

    private static List<Product> productList = new ArrayList<>();
    private static int ID_COUNTER = 0;


    public Product() {
        this.id = ID_COUNTER++;
        Product.productList.add(this);
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this(); // TODO: magyarázatot kérek
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
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

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

// Static, mert az UML-ben alá volt húzva
    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        return Product.productList.stream().filter(product -> product.productCategory == productCategory).collect(Collectors.toList());
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        return Product.productList.stream().filter(product -> product.supplier == supplier).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.format("[id:%d, name:%s, defaultPrice:%.2f, defaultCurrency:%s]",
                this.id,
                this.name,
                this.defaultPrice,
                this.defaultCurrency);
    }
}
