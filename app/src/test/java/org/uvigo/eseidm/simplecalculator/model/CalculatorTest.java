package org.uvigo.eseidm.simplecalculator.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        calculator.setOp1(10.0);
        calculator.setOp2(5.0);
        Double result = calculator.sum();
        assertEquals(new Double(15.0), result);

    }
}