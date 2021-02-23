package ru.skvrez.absract_factory_example.product;

import ru.skvrez.absract_factory_example.enums.Filling;
import ru.skvrez.absract_factory_example.shared.Named;
import ru.skvrez.absract_factory_example.shared.Shaped;

public interface Cake extends Named, Shaped {
    Filling getFilling();
}
