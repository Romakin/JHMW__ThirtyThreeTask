package org.example.models.product;

import java.util.Date;
import java.util.List;

public class Product implements Comparable<Product> {

    protected String name;
    protected double price;
    protected int size;
    protected List<Category> categories;
    protected int avaliable;
    protected ProductRating rating;
    protected MaufacturedRegion manufacturedRegion;
    protected Date manufacturedDate;

    public Product(String name, double price, List<Category> categories, int avaliable) {
        this.name = name;
        this.price = price;
        this.categories = categories;
        this.avaliable = avaliable;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setRating(ProductRating rating) {
        this.rating = rating;
    }
    public void setRating(String rating) { this.rating = ProductRating.getVal(rating); }
    public void setRating(Integer rating) { this.rating = ProductRating.getVal(rating); }

    public void setManufacturedRegion(MaufacturedRegion manufacturedRegion) {
        this.manufacturedRegion = manufacturedRegion;
    }
    public void setManufacturedRegion(String manufacturedRegion) {
        this.manufacturedRegion = MaufacturedRegion.valueOf(manufacturedRegion.toUpperCase());
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }


    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
