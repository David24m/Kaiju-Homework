package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import com.example.user.kaijuhomework.*;

public class HarrierTest {

    Harrier harrier;
    Rodan rodan;

    @Before
    public void before(){
        harrier = new Harrier("Harrier", 25, 30, 60);
        rodan = new Rodan("Rodan", 90, 30);
    }

    @Test
    public void hasAType(){
        assertEquals("Harrier", harrier.getType());
    }

    @Test
    public void hasAHealthValue(){
        assertEquals(25, harrier.getHealthValue());
    }

    @Test
    public void canAttack(){
        assertEquals(30, harrier.getAttackValue());
    }

    @Test
    public void canAttackKaiju(){
        harrier.attack(rodan);
        assertEquals(60, rodan.healthValue);
    }

    @Test
    public void canSigantureAttackKaiju(){
        harrier.signatureAttack(rodan);
        assertEquals(30, rodan.healthValue);
    }
}
