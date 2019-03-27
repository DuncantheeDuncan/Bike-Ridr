package bicycles.rides;

import bicycles.models.Tandem;
import bicycles.rides.BikeRideFastAndFurious;
import bicycles.rides.BikeRideMoreBrakes;
import bicycles.rides.BikeRideMoreCautious;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBikeTest {
    @Test
    public  void testingMoreBrakes(){
        Tandem tandem = new Tandem();
        BikeRideMoreBrakes bikeRideMoreBrakes = new BikeRideMoreBrakes(tandem);
        bikeRideMoreBrakes.ride();
        assertEquals(bikeRideMoreBrakes.currentSpeed(),14);

    }
    @Test
    public void testingForMoreCautious(){

        Tandem tandem = new Tandem();
        BikeRideMoreCautious bikeRideMoreCautious = new BikeRideMoreCautious(tandem);
        bikeRideMoreCautious.ride();
        assertEquals(bikeRideMoreCautious.currentSpeed(),34);
    }

    @Test
    public void testingForFastAndFurious(){

        Tandem tandem = new Tandem();
        BikeRideFastAndFurious bikeRideFastAndFurious = new BikeRideFastAndFurious(tandem);
        bikeRideFastAndFurious.ride();
        assertEquals(bikeRideFastAndFurious.currentSpeed(),178);
    }
}
