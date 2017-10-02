package model;

import java.util.HashMap;

public class Field {
    private final HashMap<Integer, IFigure> figures;

    private final int sizeX;

    private final int sizeY;

    public Field(HashMap figures, int sizeX, int sizeY) {
        this.figures = figures;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public int getSizeX() {
        return this.sizeX;
    }

    public int getSizeY() {
        return this.sizeY;
    }

    public int getSize() {
        return this.sizeX * this.sizeY;
    }

    public IFigure getFigure(int id) {
        return figures.get(id);
    }

    public void setFigure(int id, IFigure figure) {
        figures.put(id, figure);
    }

}
