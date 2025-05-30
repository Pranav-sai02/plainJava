package com.neoteric.restarunts;

import java.util.List;
import java.util.Objects;

public class Restaurant {

    private int id;
    private String name;
    private String address;
    private List<Menu> menus;

    public Restaurant() {}

    public Restaurant(int id, String name, String address, List<Menu> menus) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.menus = menus;
    }



    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public List<Menu> getMenus() {
        return menus;
    }
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Restarunt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menus=" + menus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
