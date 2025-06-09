package DesignPatterns.Factory.AbstractFactory.ResourcesExample.Factories;

import DesignPatterns.Factory.AbstractFactory.ResourcesExample.AzureRam;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.BlobStorage;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;

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
