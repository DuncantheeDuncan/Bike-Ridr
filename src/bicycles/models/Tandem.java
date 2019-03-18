package bicycles.models;


import bicycles.*;


public class Tandem extends BicycleBase {

    public void accelerate() {
        changeSpeed(12);

    }


    public void brake() {
        changeSpeed(-7);

    }


    public int currentSpeed() {// infinite why??
        return  currentSpeed();
    }


    public void stop() {
        changeSpeed(0);

    }
}
