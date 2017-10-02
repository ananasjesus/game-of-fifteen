package controller;

import model.*;
public class MoveController {
    public static void swap(Field field, int id1, int id2) {
        IFigure tempFigure = field.getFigure(id1);
        field.setFigure(id1, field.getFigure(id2));
        field.setFigure(id2, tempFigure);
    }
}
