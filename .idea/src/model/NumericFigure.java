package model;

public class NumericFigure implements IFigure<Integer>{

    private final int id;

    private final Integer value;

    public NumericFigure(int id, Integer value) {
        this.value = value;
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
