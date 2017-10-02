package model;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class FieldTest {
    @Test
    public void getSizeX() throws Exception {
        final HashMap<Integer, IFigure> testFigures = new HashMap<>();

        final int testSizeX = 3;

        final int testSizeY = 4;

        final Field testField = new Field(testFigures, testSizeX, testSizeY);

        assertEquals(testSizeX, testField.getSizeX());
    }

    @Test
    public void getSizeY() throws Exception {
        final HashMap<Integer, IFigure> testFigures = new HashMap<>();

        final int testSizeX = 3;

        final int testSizeY = 4;

        final Field testField = new Field(testFigures, testSizeX, testSizeY);

        assertEquals(testSizeY, testField.getSizeX());
    }

    @Test
    public void getSize() throws Exception {
        final HashMap<Integer, IFigure> testFigures = new HashMap<>();

        final int testSizeX = 3;

        final int testSizeY = 4;

        final Field testField = new Field(testFigures, testSizeX, testSizeY);

        assertEquals(testSizeX * testSizeY, testField.getSizeX());
    }

    @Test
    public void getFigure() throws Exception {
        final HashMap<Integer, IFigure> testFigures = new HashMap<>();

        final int testSizeX = 3;

        final int testSizeY = 4;

        final NumericFigure testFigure1 = new NumericFigure(1, 10);
        final NumericFigure testFigure2 = new NumericFigure(2, 12);


        testFigures.put(1, testFigure1);
        testFigures.put(2, testFigure2);

        final Field testField = new Field(testFigures, testSizeX, testSizeY);

        assertEquals(testFigure1, testField.getFigure(1));
        assertEquals(testFigure2, testField.getFigure(2));
    }

    @Test
    public void setFigure() throws Exception {
        final HashMap<Integer, IFigure> testFigures = new HashMap<>();

        final int testSizeX = 3;

        final int testSizeY = 4;

        final NumericFigure testFigure1 = new NumericFigure(1, 10);
        final NumericFigure testFigure2 = new NumericFigure(2, 12);


        testFigures.put(1, testFigure1);
        testFigures.put(2, testFigure2);

        final Field testField = new Field(testFigures, testSizeX, testSizeY);

        testField.setFigure(1, testFigure2);

        assertEquals(testFigure2, testField.getFigure(1));
    }

}