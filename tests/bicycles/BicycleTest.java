package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

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
    @Test
    public  void testingTandem(){
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        tandem.accelerate();
        tandem.brake();
        tandem.stop();
        tandem.brake();
        tandem.brake();
        assertEquals(tandem.currentSpeed(),0);

    }


    @Test
    public void testingRoadBike(){
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.stop();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(),18);

    }
}
