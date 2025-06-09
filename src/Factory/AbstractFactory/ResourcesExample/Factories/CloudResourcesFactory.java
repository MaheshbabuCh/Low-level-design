package Factory.AbstractFactory.ResourcesExample.Factories;

import Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;
import Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;

public interface CloudResourcesFactory {

    Storage createStorage();
    RAM createRam();
}
