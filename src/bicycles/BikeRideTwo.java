package bicycles;

public class BikeRideTwo implements BikeRide{
    private final BikeRide bicycle;
// one
    public BikeRideTwo(BikeRide bicycle) {
        this.bicycle = bicycle;
    }
    //one

   /* public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }*/

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.stop();/*added stop method*/
    }


    public void accelerate() {

    }


    public void brake() {

    }

    public int currentSpeed() {

        return this.bicycle.currentSpeed();
    }


    public void stop() {

    }
}
