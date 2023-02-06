package by.itacademy.hw7.Task2;

public class CelsiusKelvinConverter implements Converter {

    @Override
    public double convertDirect(double value) {
        return value + 273.15;
    }

    @Override
    public double convertReverse(double value) {
        return value - 273.15;
    }
}
