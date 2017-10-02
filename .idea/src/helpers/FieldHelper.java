package helpers;

import model.*;


import java.util.HashMap;

public class FieldHelper {
    public static Field getClassicField() {
        final HashMap<Integer, IFigure> figures = new HashMap<>();

        final int sizeX = 4;
        final int sizeY = 4;
        final int size = sizeX * sizeY;

        NumericFigure currentFigure;

        for (int i = 1; i < size; i++) {
            currentFigure = new NumericFigure(i, i);
            figures.put(i, currentFigure);
        }
        currentFigure = new NumericFigure(size, null);
        figures.put(size, currentFigure);

        return new Field(figures, sizeX, sizeY);

    }



}
