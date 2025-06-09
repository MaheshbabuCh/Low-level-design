package AdapterPattern.Adapters;

import AdapterPattern.ThirdParties.GLog.GLog;

public class GLogAdapter implements ILogger{
    @Override
    public void printLog(String message) {
        GLog gLog = new GLog();
        gLog.log(message);
    }
}
