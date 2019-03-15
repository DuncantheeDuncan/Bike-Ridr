package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccellerate() {
//       (1)<-- represents CLASS --> Bicycle (2)<-- acts as --> object bicycle = new Bicycle();
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRideOne(roadBike);
        bikeRide.ride();

        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(),0);
    }
    @Test
    public void shouldAccelerate2(){
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.ride();

        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(),0);
    }
    @Test
    public void testBikeOne(){
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();

        System.out.println(bikeRideOne.currentSpeed());
        assertEquals(bikeRideOne.currentSpeed(),1);


    }

}
