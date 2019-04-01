package bicycles.rides;
import bicycles.Bicycle;

public class BikeRideMoreBrakes implements BikeRide {

    private Bicycle bicycle;

    public BikeRideMoreBrakes(Bicycle bicycle) {

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
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
    }
}
