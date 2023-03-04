package by.itacademy.hw18.task1.elemetsDisign;

import by.itacademy.hw18.task1.collectedElements.Chassis;
import by.itacademy.hw18.task1.interfaces.ILineStep;
import by.itacademy.hw18.task1.interfaces.IProductPart;

public class ChassisDesign implements ILineStep {
    public IProductPart buildProductPart() {
        return new Chassis();
    }
}
