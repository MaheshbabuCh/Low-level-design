package DesignPatterns.Factory.AbstractFactory.ResourcesExample.Factories;

import DesignPatterns.Factory.AbstractFactory.ResourcesExample.AwsRam;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.S3Storage;

public class AWSFactory implements CloudResourcesFactory {

    @Override
    public Storage createStorage() {
        return new S3Storage();
    }

    @Override
    public RAM createRam() {
        return new AwsRam();
    }
}
