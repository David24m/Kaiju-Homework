package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import com.example.user.kaijuhomework.*;

public class RodanTest {


    Rodan rodan;
    Harrier harrier;

    @Before
    public void before(){
        rodan = new Rodan("Rodan", 90, 30);
        harrier = new Harrier("Harrier", 40, 30, 60);
    }

    @Test
    public void hasAName(){
        assertEquals("Rodan", rodan.getName());
    }

    @Test
    public void hasAHealthValue(){
        assertEquals(90, rodan.getHealthValue());
    }

    @Test
    public void hasAnAtttackValue(){
        assertEquals(30, rodan.getAttackValue());
    }

    @Test
    public void hasARoar(){
        assertEquals("SQUEAK!", rodan.roar());
    }

    @Test
    public void canAttackHarrier(){
        rodan.attack(harrier);
        assertEquals(10, harrier.healthValue);
    }

    @Test
    public void canMoveAway(){
        assertEquals("Flys away", rodan.move());
    }

}
