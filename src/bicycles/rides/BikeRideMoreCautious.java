package bicycles.rides;


import bicycles.Bicycle;
import bicycles.rides.BikeRide;

public class BikeRideMoreCautious implements BikeRide {
    private Bicycle bicycle;

    public BikeRideMoreCautious(Bicycle bicycle) {

        this.bicycle = bicycle;

    }

    public int currentSpeed() {

        return this.bicycle.currentSpeed();
    }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }







}
