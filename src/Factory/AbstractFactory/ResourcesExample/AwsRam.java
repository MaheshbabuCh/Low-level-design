package Factory.AbstractFactory.ResourcesExample;

import Factory.AbstractFactory.ResourcesExample.Intefaces.RAM;

public class AwsRam implements RAM {
    @Override
    public void provideRam(String ramStorage) {
        System.out.println("Launching AWS Ram instance with storage: "+ramStorage);
    }
}
