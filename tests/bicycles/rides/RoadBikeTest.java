package bicycles.rides;

import bicycles.models.RoadBike;

import bicycles.rides.BikeRideFastAndFurious;
import bicycles.rides.BikeRideMoreBrakes;
import bicycles.rides.BikeRideMoreCautious;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    @Test
    public  void testingMoreBrakes(){
        RoadBike roadBike = new RoadBike();
        BikeRideMoreBrakes bikeRideMoreBrakes = new BikeRideMoreBrakes(roadBike);
        bikeRideMoreBrakes.ride();
        assertEquals(bikeRideMoreBrakes.currentSpeed(),37);

    }
    @Test
    public void testingForMoreCautious(){

        RoadBike roadBike = new RoadBike();
        BikeRideMoreCautious bikeRideMoreCautious = new BikeRideMoreCautious(roadBike);
        bikeRideMoreCautious.ride();
        assertEquals(bikeRideMoreCautious.currentSpeed(),36);
    }

    @Test
    public void testingForFastAndFurious(){

        RoadBike roadBike = new RoadBike();
        BikeRideFastAndFurious bikeRideFastAndFurious = new BikeRideFastAndFurious(roadBike);
        bikeRideFastAndFurious.ride();
        assertEquals(bikeRideFastAndFurious.currentSpeed(),168);
    }
}





