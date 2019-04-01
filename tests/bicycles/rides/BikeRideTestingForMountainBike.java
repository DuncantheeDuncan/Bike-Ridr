package bicycles.rides;
import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BikeRideTestingForMountainBike {//bikeRideTestingFor
    @Test
    public  void testingMoreBrakes(){
        MountainBike mountainBike = new MountainBike();
        BikeRideMoreBrakes bikeRideMoreBrakes = new BikeRideMoreBrakes(mountainBike);
        bikeRideMoreBrakes.ride();
        assertEquals(bikeRideMoreBrakes.currentSpeed(),5);
    }
    @Test
    public void testingForMoreCautious(){
        MountainBike mountainBike = new MountainBike();
        BikeRideMoreCautious bikeRideMoreCautious = new BikeRideMoreCautious(mountainBike);
        bikeRideMoreCautious.ride();
        assertEquals(bikeRideMoreCautious.currentSpeed(),14);
    }
    @Test
    public void testingForFastAndFurious(){
        MountainBike mountainBike = new MountainBike();
        BikeRideFastAndFurious bikeRideFastAndFurious = new BikeRideFastAndFurious(mountainBike);
        bikeRideFastAndFurious.ride();
        assertEquals(bikeRideFastAndFurious.currentSpeed(),74);
    }
}
