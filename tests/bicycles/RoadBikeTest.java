package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    @Test
    public void testingRoadBikeForCurrentSpeed(){
        RoadBike roadBike = new RoadBike();
        BikeRideFastAndFurious bikeRideOneRoadbike = new BikeRideFastAndFurious(roadBike);
        bikeRideOneRoadbike.ride();
        System.out.println(bikeRideOneRoadbike.currentSpeed());
        assertEquals(bikeRideOneRoadbike.currentSpeed(),168);

    }
}




