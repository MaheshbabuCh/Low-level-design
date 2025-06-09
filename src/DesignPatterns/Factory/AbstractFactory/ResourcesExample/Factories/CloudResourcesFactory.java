package DesignPatterns.Factory.AbstractFactory.ResourcesExample.Factories;

import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;

public interface CloudResourcesFactory {

    Storage createStorage();
    RAM createRam();
}
