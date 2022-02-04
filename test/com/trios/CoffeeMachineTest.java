package com.trios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeMachineTest {
    public CoffeeMachine myMachine;

    @BeforeEach
    public void setUp(){
        myMachine = new CoffeeMachine(5000, 5000, 1000, 100, 0);
    }

    @Test
    public void testMakeCoffee(){
        myMachine.makeCoffee(100, 100, 10, 2);
        assertSame(4900, myMachine.getWater());
        assertSame(4900, myMachine.getMilk());

    }
}
