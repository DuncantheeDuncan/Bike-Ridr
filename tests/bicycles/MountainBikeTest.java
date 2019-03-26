package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void testingIfAccelarate(){
        MountainBike mountainBike = new MountainBike();
        BikeRideMoreBrakes bikeRideTwoMountainBike = new BikeRideMoreBrakes(mountainBike);
        mountainBike.accelerate();
        System.out.println(bikeRideTwoMountainBike.currentSpeed());
        assertEquals(bikeRideTwoMountainBike.currentSpeed(),5);


    }
    @Test
    public void  testingIfItBrake(){
        MountainBike mountainBike = new MountainBike();
        BikeRideMoreBrakes bikeRideTwoMountainBike = new BikeRideMoreBrakes(
                mountainBike);
        mountainBike.brake();
        System.out.println(bikeRideTwoMountainBike.currentSpeed());
        assertEquals(bikeRideTwoMountainBike.currentSpeed(),-3);

    }

    @Test
    public void testingIfItStops(){
        MountainBike mountainBike = new MountainBike();
        BikeRideMoreBrakes bikeRideTwoMountainBike = new BikeRideMoreBrakes(mountainBike);
        mountainBike.stop();
        System.out.println(bikeRideTwoMountainBike.currentSpeed());
        assertEquals(bikeRideTwoMountainBike.currentSpeed(),0);
    }
}
