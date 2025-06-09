package DesignPatterns.Factory.AbstractFactory.ResourcesExample;

import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Factories.CloudResourcesFactory;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;

public class CloudApp {

    Storage storage;
    RAM ram;

    public CloudApp(CloudResourcesFactory factory){
        this.storage = factory.createStorage();
        this.ram = factory.createRam();
    }

    public void deploy(String storage, String ram){
        this.storage.store(storage);
        this.ram.provideRam(ram);
    }
}
