package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Kaiju implements Damagable, CanAttack {

    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void attack(Damagable target){
        target.takeDamage(this.attackValue);

    }

    public void takeDamage(int damage){
        this.healthValue-=damage;
    }

    public abstract String move();


}
