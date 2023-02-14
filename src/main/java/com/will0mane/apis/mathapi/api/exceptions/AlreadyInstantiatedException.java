package com.will0mane.apis.mathapi.api.exceptions;

public class AlreadyInstantiatedException extends MathException{

    public AlreadyInstantiatedException(Class<?> clazz) {
        super("This Class cannot be instantiated more that once! (" + clazz.getName() + ")");
    }
}
