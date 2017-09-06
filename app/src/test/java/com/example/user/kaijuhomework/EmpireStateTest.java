package com.example.user.kaijuhomework;

/**
 * Created by user on 06/09/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import com.example.user.kaijuhomework.*;

public class EmpireStateTest {

    EmpireState empireState;

    @Before
    public void before() {
        empireState = new EmpireState("EmpireState", 100);
    }

    @Test
    public void hasAName(){
        assertEquals("EmpireState", empireState.getName());
    }

    @Test
    public void hasAHealthValue(){
        assertEquals(100, empireState.getHealthValue());
    }




}
