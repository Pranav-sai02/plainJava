package com.neoteric.usingMap;


import java.util.Map;

public class RestaruntDemo {

    public static void main(String[] args) {
        RestaruntService service = new RestaruntService();
        Map<Integer, Restaurant> restaurant = service.createRestaurants();
        service.printRestaurant(restaurant);
    }
}
