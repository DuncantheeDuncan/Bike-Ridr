package bicycles;


public class BikeRideOneRoadbike implements BikeRide {

    private Bicycle bicycle;

    public BikeRideOneRoadbike(Bicycle bicycle) {

        this.bicycle = bicycle;

    }

    public int currentSpeed() {

        return this.bicycle.currentSpeed();
    }
//148998
    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        //this.bicycle.stop();/*added stop method
        // for testing!*/
    }







}
