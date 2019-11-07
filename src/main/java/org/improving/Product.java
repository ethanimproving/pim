package org.improving;

public class Product {
    private String Name;
    private int Price;
    private int Stock;
    private String Version;
    private String Brand;

    public Product(String name, int price, int stock, String version, String brand) {
        Name = name;
        Price = price;
        Stock = stock;
        Version = version;
        Brand = brand;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public int getStock() {
        return Stock;
    }

    public String getVersion() {
        return Version;
    }

    public String getBrand() {
        return Brand;
    }
}
