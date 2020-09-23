package com.epam.tasks.second.view;

import com.epam.tasks.second.exceptions.FactoryNotExistsException;

public class OutputServiceFactory {

    public static OutputService getOutputService(String serviceName) throws FactoryNotExistsException {
        switch (serviceName.toLowerCase()) {
            case "console" :
                return new ConsoleOutputService();
            default:
                throw new FactoryNotExistsException("Incorrect OutputService name");
        }
    }
}
