package bicycles.models;

import bicycles.*;

public class MountainBike extends BicycleBase {


    public void accelerate() {
        changeSpeed(5);


    }


    public void brake() {
        changeSpeed(-3);

    }


    public BicycleType getBicycleType() {
        return BicycleType.MountainBike;


    }
}
