package com.neoteric.usingMap;


import java.util.HashMap;
import java.util.Map;


public class RestaruntService {
    public Map<Integer, Restaurant> createRestaurants() {
        Map<Integer, Restaurant> restaurantMap = new HashMap<>();


        MenuItem item1 = new MenuItem(1, "Paneer Butter Masala", 180.0, true);
        MenuItem item2 = new MenuItem(2, "Chicken Biryani", 220.0, false);
        MenuItem item5 = new MenuItem(1, "Paneer Butter Masala", 180.0, true);
        MenuItem item3 = new MenuItem(3, "Veg Fried Rice", 150.0, true);
        MenuItem item4 = new MenuItem(1, "Paneer Butter Masala", 180.0, true);


        Menu lunchMenu = new Menu(1, "Lunch");
        lunchMenu.getItems().put(item1.getId(), item1);
        lunchMenu.getItems().put(item2.getId(), item2);
        lunchMenu.getItems().put(item5.getId(), item5);

        Menu dinnerMenu = new Menu(2, "Dinner");
        dinnerMenu.getItems().put(item3.getId(), item3);
        dinnerMenu.getItems().put(item4.getId(), item4);

        // Create Restaurant
        Restaurant restaurant = new Restaurant(1, "Spicy Village","hyd");
        restaurant.getMenus().put(lunchMenu.getId(), lunchMenu);
        restaurant.getMenus().put(dinnerMenu.getId(), dinnerMenu);


        restaurantMap.put(restaurant.getId(), restaurant);

        return restaurantMap;
    }

    public void printRestaurant(Map<Integer, Restaurant> restaurant) {
        System.out.println(restaurant);
    }

}
