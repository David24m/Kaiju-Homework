package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import com.example.user.kaijuhomework.*;

public class TankTest {

    Tank tank;
    Godzilla godzilla;
    EmpireState empireState;

    @Before
    public void before(){
        tank = new Tank("Tank", 35, 50, 75);
        godzilla = new Godzilla("Godzilla", 100, 75);
        empireState = new EmpireState("EmpireState", 100);
    }

    @Test
    public void hasAType(){
        assertEquals("Tank", tank.getType());
    }

    @Test
    public void hasAHealthValue(){
        assertEquals(35, tank.getHealthValue());
    }

    @Test
    public void canAttack(){
        assertEquals(50, tank.getAttackValue());
    }

    @Test
    public void canAttackKaiju(){
        tank.attack(godzilla);
        assertEquals(50, godzilla.healthValue);
    }

    @Test
    public void canAttackTheBuilding(){
        tank.attack(empireState);
        assertEquals(50, empireState.healthValue);
    }

    @Test
    public void canSigantureAttackKaiju(){
        tank.signatureAttack(godzilla);
        assertEquals(25, godzilla.healthValue);
    }


}
