package com.fidel.patterns.creational.factory_method;

public class EnterpriseLogger implements ILogger {
    public void LogMessage(String message) {
        System.out.println("EnterpriseLogger message: " + message);
    }

    public void LogError(String message) {
        System.out.println("EnterpriseLogger error: " + message);
    }

    public void LogVerboseInformation(String message) {
        System.out.println("EnterpriseLogger verbose information: " + message);
    }
}
