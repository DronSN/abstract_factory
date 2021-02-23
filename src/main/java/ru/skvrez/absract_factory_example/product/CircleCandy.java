package ru.skvrez.absract_factory_example.product;

import ru.skvrez.absract_factory_example.enums.Shape;
import ru.skvrez.absract_factory_example.enums.SweetLevel;

public class CircleCandy implements Candy{

    private static final SweetLevel SWEET_LEVEL = SweetLevel.MEDIUM;
    private static final String NAME = "Умеренно сладкая круглая конфета";
    private static final Shape SHAPE = Shape.CIRCLE;

    @Override
    public SweetLevel sweetLevel() {
        return SWEET_LEVEL;
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
