package by.itacademy.hw18.task1.elemetsDisign;

import by.itacademy.hw18.task1.collectedElements.CarBody;
import by.itacademy.hw18.task1.interfaces.ILineStep;
import by.itacademy.hw18.task1.interfaces.IProductPart;

public class BodyDesign implements ILineStep {

    public IProductPart buildProductPart() {
        return new CarBody();
    }
}
