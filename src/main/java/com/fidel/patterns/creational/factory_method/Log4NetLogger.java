package com.fidel.patterns.creational.factory_method;

public class Log4NetLogger implements ILogger {
    public void LogMessage(String message) {
        System.out.println("Log4NetLogger message: " + message);
    }

    public void LogError(String message) {
        System.out.println("Log4NetLogger error: " + message);
    }

    public void LogVerboseInformation(String message) {
        System.out.println("Log4NetLogger verbose information: " + message);
    }
}
