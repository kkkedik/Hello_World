package by.itacademy.hw18.task1;

import by.itacademy.hw18.task1.collectedElements.CarBody;
import by.itacademy.hw18.task1.collectedElements.Chassis;
import by.itacademy.hw18.task1.collectedElements.Engine;
import by.itacademy.hw18.task1.interfaces.IProduct;
import by.itacademy.hw18.task1.interfaces.IProductPart;

public class Car implements IProduct {
    private CarBody carBody;
    private Chassis chassis;
    private Engine engine;

    @Override
    public void installFirstPart(IProductPart part) {
        if (part instanceof CarBody) carBody = (CarBody) part;
    }

    @Override
    public void installSecondPart(IProductPart part) {
        if (part instanceof Chassis) chassis = (Chassis) part;
    }

    @Override
    public void installThirdPart(IProductPart part) {
        if (part instanceof Engine) engine = (Engine) part;
    }

    @Override
    public String toString() {
        return "carBody: " + carBody + "\nchassis: " + chassis + "\nengine: " + engine;
    }
}
