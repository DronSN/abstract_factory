package ru.skvrez.absract_factory_example;

import ru.skvrez.absract_factory_example.shared.SweetFactory;
import ru.skvrez.absract_factory_example.shared.TriangleSweetFactory;

public class App {
    public static void main(String[] args) {
        SweetFactory sweetFactory = new TriangleSweetFactory();
        Application application = new Application(sweetFactory);
        application.doSomething();
    }
}
