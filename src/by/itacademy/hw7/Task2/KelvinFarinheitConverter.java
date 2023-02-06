package by.itacademy.hw7.Task2;

public class KelvinFarinheitConverter implements Converter {

    @Override
    public double convertDirect(double value) {
        return 1.8 * (value - 273.15) + 32;
    }

    @Override
    public double convertReverse(double value) {
        return (value - 32) * 5 / 9 + 273.15;
    }
}
