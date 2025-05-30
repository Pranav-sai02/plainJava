package com.neoteric.restarunts;


import java.util.List;
import java.util.Objects;

public class Menu {

    private int id;
    private String name;
    private List<MenuItem> items;

    public Menu() {}

    public Menu(int id, String name, List<MenuItem> items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<MenuItem> getItems() { return items; }
    public void setItems(List<MenuItem> items) { this.items = items; }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return id == menu.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
