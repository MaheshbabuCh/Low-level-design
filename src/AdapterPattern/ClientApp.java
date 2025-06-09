package AdapterPattern;

import AdapterPattern.Adapters.BaseLogAdapter;
import AdapterPattern.Adapters.GLogAdapter;
import AdapterPattern.Adapters.ILogger;
import AdapterPattern.Adapters.Log4JAdapter;

public class ClientApp {

    public static void main(String[] args) {
        ILogger iLogger = new BaseLogAdapter();

        iLogger.printLog("- Logged");
    }
}
