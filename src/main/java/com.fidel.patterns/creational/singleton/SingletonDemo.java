package com.fidel.patterns.creational.singleton;

/**
 * Singleton. Intent. Ensure a class only has one instance, and provide a global point of access to it.
 */
public class SingletonDemo {
    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();
        HardProcessor processor = new HardProcessor(1);
        logger.log("Hard work started...");
        processor.processTo(5);
        logger.log("Hard work finished...");
    }
}
