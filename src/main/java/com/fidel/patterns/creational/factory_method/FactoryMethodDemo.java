package com.fidel.patterns.creational.factory_method;

/**
 * Factory Method. Intent. Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {

        LoggingProviders providerType = getTypeOfLoggingProviderFromConfigFile();
        ILogger logger = LoggerProviderFactory.getLoggingProvider(providerType);
        logger.LogMessage("Hello Factory Method Design Pattern.");
    }

    private static LoggingProviders getTypeOfLoggingProviderFromConfigFile()
    {
        // Це такий собі «хардкод», щоб не ускладнювати прикладу
        return LoggingProviders.Enterprise;
    }
}
