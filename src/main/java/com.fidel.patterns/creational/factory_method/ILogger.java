package com.fidel.patterns.creational.factory_method;

public interface ILogger {
    void LogMessage(String message);
    void LogError(String message);
    void LogVerboseInformation(String message);
}
