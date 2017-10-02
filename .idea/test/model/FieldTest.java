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
    }

    @Test
    public void getSize() throws Exception {
    }

    @Test
    public void getFigure() throws Exception {
    }

    @Test
    public void setFigure() throws Exception {
    }

}