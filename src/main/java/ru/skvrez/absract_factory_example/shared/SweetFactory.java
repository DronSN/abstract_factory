package ru.skvrez.absract_factory_example.shared;

import ru.skvrez.absract_factory_example.product.Cake;
import ru.skvrez.absract_factory_example.product.Candy;

public interface SweetFactory {
    Cake createCake();
    Candy createCandy();
}
