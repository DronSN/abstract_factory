package ru.skvrez.absract_factory_example.shared;

import ru.skvrez.absract_factory_example.product.Cake;
import ru.skvrez.absract_factory_example.product.Candy;
import ru.skvrez.absract_factory_example.product.CircleCake;
import ru.skvrez.absract_factory_example.product.CircleCandy;

public class CircleSweetFactory implements SweetFactory{
    @Override
    public Cake createCake() {
        return new CircleCake();
    }

    @Override
    public Candy createCandy() {
        return new CircleCandy();
    }
}
