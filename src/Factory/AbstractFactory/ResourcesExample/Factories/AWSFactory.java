package Factory.AbstractFactory.ResourcesExample.Factories;

import Factory.AbstractFactory.ResourcesExample.AwsRam;
import Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;
import Factory.AbstractFactory.ResourcesExample.Intefaces.Storage;
import Factory.AbstractFactory.ResourcesExample.S3Storage;

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
