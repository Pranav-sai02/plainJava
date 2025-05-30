package com.neoteric.usingMap;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@Setter
@Getter
public class Menu  {

    private int id;
    private String name;
    private Map<Integer, MenuItem> items = new HashMap<>();

    public Menu(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menus=" + items +
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
