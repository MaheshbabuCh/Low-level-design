package Factory.AbstractFactory.ResourcesExample.Factories;

import Factory.AbstractFactory.ResourcesExample.AzureRam;
import Factory.AbstractFactory.ResourcesExample.BlobStorage;
import Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;
import Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;

public class AzureFactory implements CloudResourcesFactory{
    @Override
    public Storage createStorage() {
        return new BlobStorage();
    }

    @Override
    public RAM createRam() {
        return new AzureRam();
    }
}
