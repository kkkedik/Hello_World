package by.itacademy.hw19.task1.repositories;

import by.itacademy.hw19.task1.HotelRoom;

import java.util.ArrayList;
import java.util.List;

public class HotelRoomRepository {
    private static HotelRoomRepository instance;
    private final List<HotelRoom> rooms = new ArrayList<>();


    public static HotelRoomRepository getInstance() {
        if (instance == null) {
            instance = new HotelRoomRepository();
        }
        return instance;
    }



}
