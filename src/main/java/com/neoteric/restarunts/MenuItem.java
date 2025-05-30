package com.neoteric.restarunts;


import java.util.Objects;

public class MenuItem {

    private int id;
    private String name;
    private double price;
    private boolean vegetarian;

    public MenuItem() {}

    public MenuItem(int id, String name, double price, boolean vegetarian) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }



    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isVegetarian() { return vegetarian; }
    public void setVegetarian(boolean vegetarian) { this.vegetarian = vegetarian; }


    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", vegetarian=" + vegetarian +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
