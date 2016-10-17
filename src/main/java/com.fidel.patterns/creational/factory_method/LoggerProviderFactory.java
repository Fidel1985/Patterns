package com.fidel.patterns.creational.factory_method;

public class LoggerProviderFactory {
    public static ILogger getLoggingProvider(LoggingProviders logProviders) {
        switch (logProviders) {
            case Enterprise:
                return new EnterpriseLogger();
            case Log4Net:
                return new Log4NetLogger();
            default:
                return new EnterpriseLogger();
        }
    }

}
