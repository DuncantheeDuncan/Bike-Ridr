package bicycles.models;


import bicycles.*;


public class Tandem extends BicycleBase {

    public void accelerate() {
        changeSpeed(12);


    }

// 142587
    public void brake() {
        changeSpeed(-7);

    }

    public void stop() {
        changeSpeed(0);

    }
}
