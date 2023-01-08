package by.itacademy.hw7.Task2;

public class CelsiusFahrenheitConverter implements Converter {

    @Override
    public double convertDirect(double value) {
        return (value * 9 / 5) + 32;
    }

    @Override
    public double convertReverse(double value) {
        return (value - 32) * 5 / 9;
    }

}
