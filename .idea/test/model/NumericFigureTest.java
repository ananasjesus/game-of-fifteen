package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumericFigureTest {
    @Test
    public void getId() throws Exception {

        final int testId = 10;

        final int testValue = 15;

        final NumericFigure testFigure = new NumericFigure(testId, testValue);

        assertEquals(testId, testFigure.getId());

    }

    @Test
    public void getValue() throws Exception {

        final int testId = 10;

        final int testValue = 15;

        final NumericFigure testFigure = new NumericFigure(testId, testValue);

        assertEquals(testValue, (int)testFigure.getValue());
    }

}