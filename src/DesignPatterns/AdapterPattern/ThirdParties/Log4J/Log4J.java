package DesignPatterns.AdapterPattern.ThirdParties.Log4J;

public class Log4J {

    public void logMessage(String message){
        System.out.println("Printing from Log4j "+ message);
    }
}
