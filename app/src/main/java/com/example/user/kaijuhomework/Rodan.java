package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

public class Rodan extends Kaiju {


    public Rodan(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "SQUEAK!";
    }

    public String move(){
        return "Flys away";
    }

}
