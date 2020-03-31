package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    @Test
    public void inch2feet(){
        var inch = new ArithmeticQuantity(12, Unit.INCHES);
        var foot = new ArithmeticQuantity(1,Unit.FEET);
        assertEquals(inch, foot);
    }


}
