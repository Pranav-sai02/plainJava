package com.neoteric.restarunts;


public class RestaruntDemo {

    public static void main(String[] args) {
        RestaruntService service = new RestaruntService();
        Restaurant restaurant = service.createRestaurant();
        service.printRestaurant(restaurant);
    }
}
