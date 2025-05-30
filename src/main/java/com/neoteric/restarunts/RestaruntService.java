package com.neoteric.restarunts;

import java.util.Arrays;

public class RestaruntService {

    public Restaurant createRestaurant() {

        MenuItem item1 = new MenuItem(1, "Masala Dosa", 80.0, true);
        MenuItem item5 = new MenuItem(1, "Masala Dosa", 80.0, true);
        MenuItem item2 = new MenuItem(2, "Idli Sambar", 60.0, true);
        MenuItem item3 = new MenuItem(3, "Chicken Curry", 150.0, false);
        MenuItem item4 = new MenuItem(4, "Mutton Biryani", 250.0, false);


        Menu vegMenu = new Menu(1, "South Indian Veg", Arrays.asList(item1, item2,item5));
        Menu nonVegMenu = new Menu(2, "Andhra Non-Veg", Arrays.asList(item3, item4));


        return new Restaurant(
                1,
                "Andhra Spice",
                "Madhapur, Hyderabad",
                Arrays.asList(vegMenu, nonVegMenu)
        );
    }

    public void printRestaurant(Restaurant restaurant) {
        System.out.println(restaurant);
    }



}
