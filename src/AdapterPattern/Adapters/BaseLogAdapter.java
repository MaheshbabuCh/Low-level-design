package AdapterPattern.Adapters;

import AdapterPattern.ThirdParties.BaseLog.BaseLog;

public class BaseLogAdapter implements ILogger{
    @Override
    public void printLog(String message) {
        BaseLog baseLog = new BaseLog();
        baseLog.printLog(message);
    }
}
