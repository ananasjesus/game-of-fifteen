package controller;

import model.*;
public class MoveController {

    public static int nullId(Field field) {
        for (int i = 1; i <= field.getSize(); i++)
            if (field.getFigure(i).getValue() == null)
                return i;
        return 0;
    }

    public static void swap(Field field, int id1, int id2) {
        IFigure tempFigure = field.getFigure(id1);
        field.setFigure(id1, field.getFigure(id2));
        field.setFigure(id2, tempFigure);
    }

    public static void swap(Game game, int id1, int id2) {
        Field field = game.getField();
        IFigure tempFigure = field.getFigure(id1);
        field.setFigure(id1, field.getFigure(id2));
        field.setFigure(id2, tempFigure);
    }

   /* public static boolean isLegalMove(Field field, int id) {
        int sizeX = field.getSizeX();
        int sizeY = field.getSizeY();
    }
    */
}
