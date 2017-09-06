package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }


    public String roar (){
        return "ROOOAARRR!!!";
    }

    public String move(){
        return "Stomps away";
    }

}
