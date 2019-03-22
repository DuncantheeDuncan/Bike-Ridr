package bicycles.models;

import bicycles.*;

public class MountainBike extends BicycleBase {

//  remove  private int speed =0;
    public void accelerate() {
        changeSpeed(5);


    }


    public void brake() {
        changeSpeed(-3);

    }

}
