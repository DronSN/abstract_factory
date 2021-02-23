package ru.skvrez.absract_factory_example.shared;

import ru.skvrez.absract_factory_example.product.Cake;
import ru.skvrez.absract_factory_example.product.Candy;
import ru.skvrez.absract_factory_example.product.TriangleCake;
import ru.skvrez.absract_factory_example.product.TriangleCandy;

public class TriangleSweetFactory implements SweetFactory{
    @Override
    public Cake createCake() {
        return new TriangleCake();
    }

    @Override
    public Candy createCandy() {
        return new TriangleCandy();
    }
}
