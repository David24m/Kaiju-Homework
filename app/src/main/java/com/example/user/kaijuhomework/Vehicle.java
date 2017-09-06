package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Vehicle implements Damagable, CanAttack, SignatureAttack {

    String type;
    int healthValue;
    int attackValue;
    int signatureAttackValue;


    public Vehicle (String type, int healthValue, int attackValue, int signatureAttackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.signatureAttackValue = signatureAttackValue;
    }

    public String getType() {
        return type;
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

    public void signatureAttack(Damagable target){
        target.takeDamage(this.signatureAttackValue);

    }

    public void takeDamage(int damage){
        this.healthValue-=damage;
    }

}
