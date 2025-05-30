package com.neoteric.restaruntUsingSet;

import java.util.HashSet;
import java.util.Set;

public class RestaruntService {
    public Restaurant createRestaurant() {

        MenuItem item1 = new MenuItem(1, "Masala Dosa", 80.0, true);
        MenuItem item5 = new MenuItem(1, "Masala Dosa", 80.0, true);
        MenuItem item2 = new MenuItem(2, "Idli Sambar", 60.0, true);
        MenuItem item3 = new MenuItem(3, "Chicken Curry", 150.0, false);
        MenuItem item4 = new MenuItem(4, "Mutton Biryani", 250.0, false);

        Set<MenuItem> vegItems = new HashSet<>();
        vegItems.add(item1);
        vegItems.add(item2);
        vegItems.add(item5);

        Set<MenuItem> nonVegItems = new HashSet<>();
        nonVegItems.add(item3);
        nonVegItems.add(item4);


        Menu vegMenu = new Menu(1, "South Indian Veg", vegItems);
        Menu nonVegMenu = new Menu(2, "Andhra Non-Veg", nonVegItems);

        Set<Menu> menus = new HashSet<>();
        menus.add(vegMenu);
        menus.add(nonVegMenu);


        return new Restaurant(1, "Andhra Spice", "Madhapur, Hyderabad", menus);
    }

    public void printRestaurant(Restaurant restaurant) {
        System.out.println(restaurant);
    }





}
