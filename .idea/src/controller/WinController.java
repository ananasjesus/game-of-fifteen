package controller;

import model.*;

public class WinController {
    public static boolean isWin(Field field) {
        final int fieldSize = field.getSize();

        for (int i = 1; i < fieldSize; i++)
            if (field.getFigure(i).getId() != i)
                return false;

        return true;
    }
}
