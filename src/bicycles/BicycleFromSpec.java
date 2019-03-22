package bicycles;

public class BicycleFromSpec extends BicycleBase {
    private  BicycleSpecification num;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
    this.num =bicycleSpecification;

    }

    public void accelerate() {
      changeSpeed(num.getAccelerationSpeed());

    }
//148998

    public void brake() {
      changeSpeed(num.getBrakeSpeed());

    }
}
