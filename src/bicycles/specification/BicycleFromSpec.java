package bicycles.specification;

import bicycles.BicycleBase;
import bicycles.BicycleType;
import bicycles.specification.BicycleSpecification;

public class BicycleFromSpec extends BicycleBase {
    private BicycleSpecification num;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
    this.num =bicycleSpecification;

    }

    public void accelerate() {
      changeSpeed(num.getAccelerationSpeed());

    }

    public void brake() {
      changeSpeed(num.getBrakeSpeed());

    }


    public BicycleType getBicycleType() {
        return num.getBicycleType();
    }
}
