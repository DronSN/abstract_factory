package ru.skvrez.absract_factory_example;

import ru.skvrez.absract_factory_example.shared.SweetFactory;

public class Application {
    private SweetFactory sweetFactory;

    Application(SweetFactory sweetFactory) {
        this.sweetFactory = sweetFactory;
    }
    public void doSomething() {
        System.out.println(sweetFactory.createCake().name());
        System.out.println(sweetFactory.createCandy().name());
    }
}
