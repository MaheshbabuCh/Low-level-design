package DesignPatterns.AdapterPattern.Adapters;


import DesignPatterns.AdapterPattern.ThirdParties.Log4J.Log4J;

public class Log4JAdapter implements ILogger {
    @Override
    public void printLog(String message) {
        Log4J log4J = new Log4J();
        log4J.logMessage(message);
    }
}
