package DesignPatterns.AdapterPattern.Adapters;

import DesignPatterns.AdapterPattern.ThirdParties.GLog.GLog;

public class GLogAdapter implements ILogger{
    @Override
    public void printLog(String message) {
        GLog gLog = new GLog();
        gLog.log(message);
    }
}
