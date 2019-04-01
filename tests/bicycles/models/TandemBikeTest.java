package bicycles.models;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TandemBikeTest {
    @Test
    public  void shouldAccelerate() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        assertEquals(tandem.currentSpeed(),12);
    }
    @Test
    public  void shouldBrake() {
        Tandem tandem = new Tandem();
        tandem.brake();
        assertEquals(tandem.currentSpeed(),0);
    }
    @Test
    public  void shouldStop() {
        Tandem tandem = new Tandem();
        tandem.stop();
        assertEquals(tandem.currentSpeed(),0);
    }
}
