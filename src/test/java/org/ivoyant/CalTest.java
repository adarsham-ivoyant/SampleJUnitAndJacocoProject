package org.ivoyant;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalTest {
   // private Calculator calculator;


    @Test
    void testForAdd() {
        assertEquals(5, Calculator.add(3, 2));
    }
    @Test
    void testforSub(){
        assertEquals(2, Calculator.sub(3, 2));
    }
    @Test
    void testForMul(){
        assertEquals(6, Calculator.mul(3, 2));
    }
    @Test
    void testForDiv(){
        assertEquals(2, Calculator.div(4, 0));
    }

    @BeforeClass
    public void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }
    @Test
    void testMaxarr(){
        assertEquals(4,Calculator.findMax(new int[]{1,3,4,2}));
    }

}
