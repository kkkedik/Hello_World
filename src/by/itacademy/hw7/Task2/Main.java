package by.itacademy.hw7.Task2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        KelvinFarinheitConverter kelvinFarinheitConverter = new KelvinFarinheitConverter();
        CelsiusFahrenheitConverter celsiusFahrenheitConverter = new CelsiusFahrenheitConverter();
        CelsiusKelvinConverter celsiusKelvinConverter = new CelsiusKelvinConverter();

        System.out.println(celsiusFahrenheitConverter.convertDirect(10));
        System.out.println(celsiusFahrenheitConverter.convertReverse(10));

        System.out.println(celsiusKelvinConverter.convertDirect(10));
        System.out.println(celsiusKelvinConverter.convertReverse(10));

        System.out.println(kelvinFarinheitConverter.convertDirect(10));
        System.out.println(kelvinFarinheitConverter.convertReverse(10));
    }
}
