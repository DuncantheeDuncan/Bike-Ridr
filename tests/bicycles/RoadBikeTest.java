package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    @Test
    public void testingRoadBike(){
        RoadBike roadBike = new RoadBike();
        /*starting with the class that im going to test from
         * so you call it 'class' and reference it with
         * a new "variable" of some sort!(instance)
         * to new 'class' that you can use
         * #almost same as updating a variable in javascript
         * var a = a;.*/
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        /*same applies as mentioned above the diff is we dealing
        with a ride class
        * but now the  parantaces of a ride bike
        * takes */
        bikeRideThree.ride();

        System.out.println(bikeRideThree.currentSpeed());
        assertEquals(bikeRideThree.currentSpeed(),36);

    }
}
