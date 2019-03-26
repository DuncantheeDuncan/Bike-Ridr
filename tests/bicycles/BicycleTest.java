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
        mountainBike.accelerate();
        mountainBike.brake();
        //System.out.println(mountainBike.currentSpeed());
        assertEquals(mountainBike.currentSpeed(),9);


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
        tandem.accelerate();
        tandem.accelerate();
        // System.out.println(bikeRideTwo.currentSpeed());
        assertEquals(tandem.currentSpeed(),46);

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
        // System.out.println(bikeRideThree.currentSpeed());
        assertEquals(roadBike.currentSpeed(),18);

    }
}
