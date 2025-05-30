package com.neoteric.restaruntUsingSet;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;


@Getter
@Setter
public class Menu {

    private int id;
    private String name;
    private Set<MenuItem> items;

    public Menu(int id, String name, Set<MenuItem> items) {
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
