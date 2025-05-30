package com.neoteric.restaruntUsingSet;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;


@Getter
@Setter
public class Restaurant {

    private int id;
    private String name;
    private String address;
    private Set<Menu> menus;

    public Restaurant(int id, String name, String address, Set<Menu> menus) {
        this.id = id;
        this.name = name;
        this.address = address;
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
