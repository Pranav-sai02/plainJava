package com.neoteric.usingTreeSet;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Setter
@Getter
public class Menu implements Comparable<Menu> {

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
        return Integer.hashCode(id);
    }

    @Override
    public int compareTo(Menu o) {
        return Integer.compare(this.id, o.getId());
    }
}
