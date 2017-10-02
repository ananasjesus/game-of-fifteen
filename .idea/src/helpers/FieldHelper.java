package helpers;

import model.*;


import java.util.HashMap;

public class FieldHelper {
    public static Field getClassicField() {
        final HashMap<Integer, IFigure> figures = new HashMap<>();

        final int sizeX = 4;
        final int sizeY = 4;
        final int size = sizeX * sizeY;


        for (int i = 1; i < size; i++) {
            figures.put(i, new NumericFigure(i, i));
        }

        figures.put(size, new NumericFigure(size, null));

        return new Field(figures, sizeX, sizeY);

    }



}
