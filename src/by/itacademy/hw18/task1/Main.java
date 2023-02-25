package by.itacademy.hw18.task1;

public class Main {
    public static void main(String[] args) {
        CarAssemblyLine carAssemblyLine = new CarAssemblyLine();
        Car emptyCar = new Car();
        Car car = (Car) carAssemblyLine.assembleProduct(emptyCar);
        System.out.println(car.toString());
    }
}
