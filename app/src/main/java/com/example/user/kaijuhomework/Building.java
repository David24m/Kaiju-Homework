package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Building implements Damagable {

    String name;
    int healthValue;

    public Building(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void takeDamage(int damage){
        this.healthValue-=damage;
    }
}
