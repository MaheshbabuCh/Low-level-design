package Factory.AbstractFactory.ResourcesExample;

import Factory.AbstractFactory.ResourcesExample.Factories.CloudResourcesFactory;
import Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;
import Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;

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
