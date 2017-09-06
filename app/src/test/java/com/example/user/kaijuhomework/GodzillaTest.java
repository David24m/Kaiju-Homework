package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import com.example.user.kaijuhomework.*;

public class GodzillaTest {

    Godzilla godzilla;
    Tank tank;
    EmpireState empireState;

    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 100, 75);
        tank = new Tank("Tank", 100, 50, 75);
        empireState = new EmpireState("EmpireState", 100);
    }

    @Test
    public void hasAName(){
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void hasAHealthValue(){
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void hasAnAtttackValue(){
        assertEquals(75, godzilla.getAttackValue());
    }

    @Test
    public void hasARoar(){
        assertEquals("ROOOAARRR!!!", godzilla.roar());
    }

    @Test
    public void canAttackTank(){
        godzilla.attack(tank);
        assertEquals(25, tank.healthValue);
    }

    @Test
    public void canAttackEmpireState(){
        godzilla.attack(empireState);
        assertEquals(25, empireState.healthValue);
    }

    @Test
    public void canMoveAway(){
        assertEquals("Stomps away", godzilla.move());
    }
}
