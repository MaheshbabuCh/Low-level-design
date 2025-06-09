package DesignPatterns.Factory.AbstractFactory.ResourcesExample;

import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;

public class BlobStorage implements Storage {
    @Override
    public void store(String data) {
        System.out.println("Implementing blob storage for Azure with data " + data);
    }
}
