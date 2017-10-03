package controller;

import org.junit.Test;

import static org.junit.Assert.*;

import model.*;

import helpers.*;
import view.*;

public class MoveControllerTest {
    @Test
    public void swap() throws Exception {

        Field field = FieldHelper.getClassicField();

        int swapId1 = 5;
        int swapId2 = 10;

        MoveController.swap(field, swapId1, swapId2);

        int expectedId = swapId2;
        int resultId = field.getFigure(swapId1).getId();

        assertEquals(expectedId, resultId);

    }

    @Test
    public void nullId() throws Exception {

        Field field = FieldHelper.getClassicMixedField();

        ConsoleView.printField(field);

        System.out.print(MoveController.nullId(field));

        assertTrue(true);
    }

    @Test
    public void isLegalMove() throws Exception {

        Field field = FieldHelper.getClassicMixedField();

        ConsoleView.printField(field);

        for (int i = 1; i <= field.getSize(); i++) {
            System.out.printf("\n%3d=%s", i, MoveController.isLegalMove(field, i));
        }

        assertTrue(true);
    }


}