package controller;

import org.junit.Test;

import static org.junit.Assert.*;
import model.*;
import helpers.*;

public class WinControllerTest {
    @Test
    public void isWin() throws Exception {
        Field winField = FieldHelper.getClassicField();
        Field notWinField = FieldHelper.getClassicMixedField();

        assertTrue(WinController.isWin(winField));
        assertFalse(WinController.isWin(notWinField));

    }

}