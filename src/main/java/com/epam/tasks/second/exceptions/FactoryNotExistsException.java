package com.epam.tasks.second.exceptions;

public class FactoryNotExistsException extends Exception {

    public FactoryNotExistsException() {
        super("Factory not exists");
    }

    public FactoryNotExistsException(String message) {
        super(message);
    }

}
