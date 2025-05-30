package com.neoteric.balls;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Ball {

    private String color;

    private int ball_number;


    public Ball(String color, int ball_number) {
        this.color = color;
        this.ball_number = ball_number;
    }

}
