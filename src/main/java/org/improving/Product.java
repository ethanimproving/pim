package org.improving;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true)
    private int id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Price")
    private int Price;

    @Column(name = "Stock")
    private int Stock;

    @Column(name = "Version")
    private String Version;

    @Column(name = "Brand")
    private String Brand;

    @Transient
    private int Sku;

    @Transient
    private String Color;

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

    public void setName(String name) {
        this.Name = name;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getSku() {
        return Sku;
    }

    public void setSku(int sku) {
        Sku = sku;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
