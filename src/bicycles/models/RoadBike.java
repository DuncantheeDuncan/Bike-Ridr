package bicycles.models;

import bicycles.*;

public class RoadBike extends BicycleBase {

    public void accelerate() {
       changeSpeed(11);


    }


    public void brake() {
       changeSpeed(-4);

    }


//    Use the changeSpeed method from BicycleBase.
}
