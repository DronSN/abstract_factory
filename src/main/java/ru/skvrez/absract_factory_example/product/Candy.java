package ru.skvrez.absract_factory_example.product;

import ru.skvrez.absract_factory_example.enums.SweetLevel;
import ru.skvrez.absract_factory_example.shared.Named;
import ru.skvrez.absract_factory_example.shared.Shaped;

public interface Candy extends Named, Shaped {
    SweetLevel sweetLevel();
}
