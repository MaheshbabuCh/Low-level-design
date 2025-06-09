package DesignPatterns.Factory.AbstractFactory.ResourcesExample;

import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Factories.AWSFactory;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Factories.AzureFactory;
import DesignPatterns.Factory.AbstractFactory.ResourcesExample.Factories.CloudResourcesFactory;

public class Client {

    public static void main(String[] args) {
        CloudResourcesFactory factory;

        String provider = "Azure"; // could come from config, env, UI, etc.

        if (provider.equals("aws")) {
            factory = new AWSFactory();
        } else {
            factory = new AzureFactory();
        }

        CloudApp app = new CloudApp(factory);
        app.deploy("128", "16");

    }


}
