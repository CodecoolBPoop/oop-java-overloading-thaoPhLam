package com.codecool.uml.overloading;

import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Webshop {

    public static void main(String[] args) {
	// write your code here
        Supplier emptySupplier = new Supplier();
        Supplier lenovoSupplier = new Supplier("Lenovo", "Laptop supplier");
        Supplier asusSupplier = new Supplier("Asus", "Laptop supplier");
        Supplier amazonSupplier = new Supplier("Amazon", "Ebook supplier");

        ProductCategory emptyCategory = new ProductCategory();
        ProductCategory laptopCategory = new ProductCategory("Laptop", "Hardware", "Portable PC");
        FeaturedProductCategory ebookCategory = new FeaturedProductCategory("Ebook", "Book", "Electronic book");
        ebookCategory.schedule(getDate(2016, 0, 1),
                getDate(2017, 0, 1));

        Product product1 = new Product();
        product1.setProductCategory(emptyCategory);
        product1.setSupplier(emptySupplier);

        Product product2 = new Product("Lenovo A1", 1200f, Currency.getInstance("USD"));
        product2.setProductCategory(laptopCategory);
        product2.setSupplier(lenovoSupplier);

        Product product3 = new Product("Lenovo B3", 1500f, Currency.getInstance("USD"));
        product3.setProductCategory(laptopCategory);
        product3.setSupplier(lenovoSupplier);

        Product product4 = new Product("ASUS ROG S1", 2000f, Currency.getInstance("USD"));
        product4.setProductCategory(laptopCategory);
        product4.setSupplier(asusSupplier);

        Product product5 = new Product("ASUS ROG X6", 2300f, Currency.getInstance("USD"));
        product5.setProductCategory(laptopCategory);
        product5.setSupplier(asusSupplier);

        Product product6 = new Product("Clean Code", 60f, Currency.getInstance("EUR"));
        product6.setSupplier(amazonSupplier);
        product6.setProductCategory(ebookCategory);

        Product product7 = new Product("Howto JAVA in 24 hours", 40f, Currency.getInstance("EUR"));
        product7.setSupplier(amazonSupplier);
        product7.setProductCategory(ebookCategory);

        System.out.println(product1);
        System.out.println(ebookCategory);
        System.out.println(amazonSupplier);
        System.out.println(listToFormattedString(laptopCategory.getProducts()));
        System.out.println(listToFormattedString(ebookCategory.getProducts()));
        System.out.println(listToFormattedString(lenovoSupplier.getProducts()));
    }

    private static Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        Date date = calendar.getTime();
        return date;
    }

    private static String listToFormattedString(List<?> lst) {
        final String joined = lst.stream()
                .map(item -> item.toString())
                .collect(joining("\n"));
        return "\n" + joined;
    }
}
