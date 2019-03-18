package bicycles.models;

import bicycles.*;

public class MountainBike extends BicycleBase {
    //@Override
//  remove  private int speed =0;
    public void accelerate() {
        changeSpeed(5);

    }

    //@Override
    public void brake() {
        changeSpeed(-3);

    }

}
