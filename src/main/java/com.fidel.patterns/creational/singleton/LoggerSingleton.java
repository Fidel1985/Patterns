package com.fidel.patterns.creational.singleton;

// if logCount -> static : singleton -> monostate pattern
public class LoggerSingleton {
    private int logCount = 0;
    private static LoggerSingleton instance = null;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(logCount + ": " + message);
        logCount++;
    }
}
