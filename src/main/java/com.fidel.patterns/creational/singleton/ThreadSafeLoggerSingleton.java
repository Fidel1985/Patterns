package com.fidel.patterns.creational.singleton;

public class ThreadSafeLoggerSingleton {
    private int logCount = 0;
    private static ThreadSafeLoggerSingleton instance;
    private static final Object locker = new Object();

    private ThreadSafeLoggerSingleton() {
        // Читаємо дані з якогось файлу і дістаємо номер останнього запису
        // _logCount = вичитане значення
    }

    public static ThreadSafeLoggerSingleton getInstance() {
        synchronized (locker) {
            if (instance == null) {
                instance = new ThreadSafeLoggerSingleton();
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(logCount + ": " + message);
        logCount++;
    }
}
