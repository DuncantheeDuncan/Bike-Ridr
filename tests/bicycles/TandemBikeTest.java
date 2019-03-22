package bicycles;

import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBikeTest {
    @Test
    public  void testingTheTandemBikeClass(){
        Tandem tandem = new Tandem();
        BikeRideTwoMountainBike bikeRideTwo = new BikeRideTwoMountainBike(tandem);
        bikeRideTwo.ride();

        System.out.println(bikeRideTwo.currentSpeed());
        assertEquals(bikeRideTwo.currentSpeed(),34);

    }
}