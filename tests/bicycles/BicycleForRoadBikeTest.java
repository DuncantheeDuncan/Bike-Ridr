package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleForRoadBikeTest {

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
