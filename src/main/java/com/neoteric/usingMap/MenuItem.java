package com.neoteric.usingMap;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItem {

    private int id;
    private String name;
    private double price;
    private boolean vegetarian;

    public MenuItem(int id, String name, double price, boolean vegetarian) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

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
        return Integer.hashCode(id);
    }


}
