package bicycles;


public class BikeRideOne implements BikeRide {

    private Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {

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


//    public void accelerate() {
//
//    }
//
//
//    public void brake() {
//
//    }

    public int currentSpeed() {

        return this.bicycle.currentSpeed();
    }


//    public void stop() {
//
//    }
}
