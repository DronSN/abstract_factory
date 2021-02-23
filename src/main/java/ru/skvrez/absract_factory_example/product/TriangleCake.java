package ru.skvrez.absract_factory_example.product;

import ru.skvrez.absract_factory_example.enums.Filling;
import ru.skvrez.absract_factory_example.enums.Shape;

public class TriangleCake implements Cake{

    private static final Filling FILLING = Filling.JAM;
    private static final String NAME = "Треугольный торт с вареньем";
    private static final Shape SHAPE = Shape.TRIANGLE;

    @Override
    public Filling getFilling() {
        return FILLING;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public Shape getShape() {
        return SHAPE;
    }
}
