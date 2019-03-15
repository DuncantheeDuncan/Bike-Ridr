package bicycles;

public class BikeRideTwo implements BikeRide{
    private final Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.stop();/*added stop method*/
    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
