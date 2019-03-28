package bicycles;


import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleForTandemBikeTest {


    @Test
    public  void tandemShouldAccelerate(){
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



}
