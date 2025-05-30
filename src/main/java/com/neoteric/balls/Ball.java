package com.neoteric.balls;


import lombok.ToString;

@ToString
public class Ball {

    private String color;

    private int ball_number;


    public Ball(String color, int ball_number) {
        this.color = color;
        this.ball_number = ball_number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBall_number() {
        return ball_number;
    }

    public void setBall_number(int ball_number) {
        this.ball_number = ball_number;
    }
}
