package ru.skvrez.absract_factory_example.product;

import ru.skvrez.absract_factory_example.enums.Shape;
import ru.skvrez.absract_factory_example.enums.SweetLevel;

public class TriangleCandy implements Candy{

    private static final SweetLevel SWEET_LEVEL = SweetLevel.HIGH;
    private static final String NAME = "Очень сладкая треугольная конфета";
    private static final Shape SHAPE = Shape.TRIANGLE;

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
