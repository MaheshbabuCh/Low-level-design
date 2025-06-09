package Factory.AbstractFactory.ResourcesExample;

import Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;

public class S3Storage implements Storage {
    @Override
    public void store(String data) {
        System.out.println("Implementing S3 storage for AWS with data: " + data);
    }
}
