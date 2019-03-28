package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleForMountainBikeTest {
    @Test
    public void testingMountainBike(){
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.stop();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.stop();
        mountainBike.accelerate();
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(),2);


    }
}
