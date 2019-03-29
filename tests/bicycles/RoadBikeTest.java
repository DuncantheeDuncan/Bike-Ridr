package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    @Test
    public void shouldAccelerate() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(), 11);


    }


    @Test
    public void shouldBrake() {
        RoadBike roadBike = new RoadBike();
        roadBike.brake();
        assertEquals(roadBike.currentSpeed(), 0);


    }

    @Test
    public void shouldStop() {
        RoadBike roadBike = new RoadBike();
        roadBike.stop();
        assertEquals(roadBike.currentSpeed(), 0);


    }
}
