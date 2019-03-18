package bicycles;


public class BikeRideThree implements BikeRide {
    private Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle) {

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
