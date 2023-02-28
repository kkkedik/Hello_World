package by.itacademy.hw19.task1.repositories;

import by.itacademy.hw19.task1.ServiceHotel;

import java.util.ArrayList;
import java.util.List;

public class ServiceRepository {
    private static ServiceRepository instance;

    public static ServiceRepository getInstance() {
        if (instance == null) {
            instance = new ServiceRepository();
        }
        return instance;
    }
}
