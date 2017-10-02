package helpers;

import model.*;

import controller.*;

import java.util.HashMap;
import java.util.Random;

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

    public static Field getClassicMixedField() {
        final Field field = getClassicField();
        final Random random = new Random();
        final int size = field.getSize();
        int id1, id2;
        for (int i = 0; i < size * 4; i++) {
            id1 = random.nextInt(size) + 1;
            id2 = random.nextInt(size) + 1;
            MoveController.swap(field, id1, id2);
        }

        return field;
    }

}
