package com.example.assignment_two.model;

import java.io.Serializable;

public class Item implements Serializable {

    // Ensures object compatibility during serialization
    private static final long serialVersionUID = 1L;

    private String name; // Name of the item
    private String shortDescription; // Short description for the item
    private String detailsUrl; // URL for the detailed item page
    private String image; // Path to the image of the item
    private double price; // Price of the item
    private String longDescription; // Detailed description of the item
    private String category; // Category to which the item belongs
    private String stockStatus; // Stock status of the item
    private double rating; // Rating of the item

    // Default constructor
    public Item() {
    }

    // Parameterized constructor to initialize all properties
    public Item(String name, String shortDescription, String detailsUrl, String image, double price,
            String longDescription, String category, String stockStatus, double rating) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.detailsUrl = detailsUrl;
        this.image = image;
        this.price = price;
        this.longDescription = longDescription;
        this.category = category;
        this.stockStatus = stockStatus;
        this.rating = rating;
    }

    // Getter and setter methods for each field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
