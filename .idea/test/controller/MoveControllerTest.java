package controller;

import org.junit.Test;

import static org.junit.Assert.*;

import model.*;

import helpers.*;

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

}