package com.neoteric.balls;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Balls {

    public static void main(String[]args){

        List<Ball> balls_list = new ArrayList<>();


        balls_list.add(new Ball("red",1));
        balls_list.add(new Ball("black",2));
        balls_list.add(new Ball("yellow",3));
        balls_list.add(new Ball("blue",4));

        balls_list.add(new Ball("red",5));
        balls_list.add(new Ball("black",6));
        balls_list.add(new Ball("yellow",7));
        balls_list.add(new Ball("blue",8));

        balls_list.add(new Ball("red",9));
        balls_list.add(new Ball("black",10));
        balls_list.add(new Ball("yellow",11));
        balls_list.add(new Ball("blue",12));



        List<Ball> red_ball = balls_list.stream()
                .filter(ball -> ball.getColor().equalsIgnoreCase("red"))
                .collect(Collectors.toList());

        Map<String, Long> colorCountMap = balls_list.stream()
                .collect(Collectors.groupingBy(Ball::getColor, Collectors.counting()));





        System.out.println(red_ball);
        System.out.println(red_ball.size());
        System.out.println(colorCountMap);

    }


}
