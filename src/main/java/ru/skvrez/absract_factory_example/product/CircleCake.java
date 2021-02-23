package ru.skvrez.absract_factory_example.product;

import ru.skvrez.absract_factory_example.enums.Filling;
import ru.skvrez.absract_factory_example.enums.Shape;

public class CircleCake implements Cake{

    private static final Filling FILLING = Filling.CHOCOLATE;
    private static final String NAME = "Круглый шоколадный торт";
    private static final Shape SHAPE = Shape.CIRCLE;

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
