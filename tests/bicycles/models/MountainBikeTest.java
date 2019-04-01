package bicycles.models;
import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MountainBikeTest {
    @Test
    public void shouldAccelerate() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        assertEquals(mountainBike.currentSpeed(), 5);
    }
    @Test
    public void shouldBrake() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(), 0);
    }
    @Test
    public void shouldStop() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.stop();
        assertEquals(mountainBike.currentSpeed(), 0);
    }
}
