package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void testingTheMountainBike(){
        MountainBike mountainBike = new MountainBike();
        BikeRideOneRoadbike bikeRideOne = new BikeRideOneRoadbike(mountainBike);
        bikeRideOne.ride();

        System.out.println(bikeRideOne.currentSpeed());
        assertEquals(bikeRideOne.currentSpeed(),14);


    }
}
