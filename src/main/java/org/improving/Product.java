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

//    public Product(String name, int price, int stock, String version, String brand) {
//        Name = name;
//        Price = price;
//        Stock = stock;
//        Version = version;
//        Brand = brand;
//    }

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
