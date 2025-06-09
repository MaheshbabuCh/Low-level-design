package DesignPatterns.AdapterPattern;

import DesignPatterns.AdapterPattern.Adapters.BaseLogAdapter;
import DesignPatterns.AdapterPattern.Adapters.ILogger;

public class ClientApp {

    public static void main(String[] args) {
        ILogger iLogger = new BaseLogAdapter();

        iLogger.printLog("- Logged");
    }
}
