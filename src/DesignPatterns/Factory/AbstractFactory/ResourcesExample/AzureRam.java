package DesignPatterns.Factory.AbstractFactory.ResourcesExample;

import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;

public class AzureRam implements RAM {
    @Override
    public void provideRam(String ramStorage) {
        System.out.println("Launching Azure instance with storage: " + ramStorage);
    }
}
