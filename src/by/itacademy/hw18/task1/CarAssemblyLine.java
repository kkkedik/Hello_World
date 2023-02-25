package by.itacademy.hw18.task1;

import by.itacademy.hw18.task1.collectedElements.CarBody;
import by.itacademy.hw18.task1.collectedElements.Chassis;
import by.itacademy.hw18.task1.collectedElements.Engine;
import by.itacademy.hw18.task1.elemetsDisign.BodyDesign;
import by.itacademy.hw18.task1.elemetsDisign.ChassisDesign;
import by.itacademy.hw18.task1.elemetsDisign.EngineDesign;
import by.itacademy.hw18.task1.interfaces.IAssemblyLine;
import by.itacademy.hw18.task1.interfaces.ILineStep;
import by.itacademy.hw18.task1.interfaces.IProduct;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarAssemblyLine implements IAssemblyLine {

    private BodyDesign bodyDesign;
    private EngineDesign engineDesign;
    private ChassisDesign chassisDesign;

    public CarAssemblyLine() {
        bodyDesign = new BodyDesign();
        chassisDesign = new ChassisDesign();
        engineDesign = new EngineDesign();
    }

    @Override
    public IProduct assembleProduct(IProduct car) {
        if (!(car instanceof Car)) return car;
        car.installFirstPart(bodyDesign.buildProductPart());
        car.installSecondPart(chassisDesign.buildProductPart());
        car.installThirdPart(engineDesign.buildProductPart());
        return car;
    }

}
