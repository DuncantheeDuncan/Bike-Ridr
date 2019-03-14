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

    //@Override
    public int currentSpeed() {
        return  currentSpeed();
    }

    //@Override
    public void stop() {
        changeSpeed(0);

    }
}
