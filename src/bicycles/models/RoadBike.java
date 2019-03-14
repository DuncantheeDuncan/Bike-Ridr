package bicycles.models;

import bicycles.*;

public class RoadBike extends BicycleBase {
    //@Override
   //delete private  int speed = 0;
    public void accelerate() {
       changeSpeed(11);

    }

//    @Override
    public void brake() {
       changeSpeed(-4);

    }

    @Override
    public int currentSpeed() {
        return currentSpeed();
    }

    @Override
    public void stop() {
        changeSpeed(0);

    }
//    Use the changeSpeed method from BicycleBase.
}
