package by.itacademy.hw11.task1.exceptions;

import java.util.function.Supplier;

public class UserNotExistException extends SystemLogException {
    public UserNotExistException(String message) {
        super(message);
    }
}
