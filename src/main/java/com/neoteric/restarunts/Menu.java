package com.neoteric.restarunts;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;



@Setter
@Getter
public class Menu {

    private int id;
    private String name;
    private List<MenuItem> items;

    public Menu(int id, String name, List<MenuItem> items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

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
