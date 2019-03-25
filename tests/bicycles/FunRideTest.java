package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void getCountForTypeTest(){
       FunRide funRide = new FunRide(4);
        BicycleSpecification roadBike = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(15,-3, BicycleType.MountainBike);
        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.Tandem);

        BicycleFromSpec bicycleFromSpec1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(tandemBike);

        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec3);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec2);

       assertEquals(1,funRide.getCountForType(BicycleType.Tandem));
        assertEquals(2,funRide.getCountForType(BicycleType.MountainBike));
        assertEquals(0,funRide.getCountForType(BicycleType.RoadBike));

    }



    @Test
    public void getEnteredCountTest(){
        FunRide funRide = new FunRide(4);
        BicycleSpecification roadBike = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(15,-3, BicycleType.MountainBike);
        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.Tandem);

        BicycleFromSpec bicycleFromSpec1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(tandemBike);

        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec3);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec3);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec2);

        assertEquals(4,funRide.getEnteredCount());

    }


    @Test
    public void accept(){
        FunRide funRide = new FunRide(4);
        BicycleSpecification roadBike = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(15,-3, BicycleType.MountainBike);
        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.Tandem);

        BicycleFromSpec bicycleFromSpec1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(tandemBike);

        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec3);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec3);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec2);

        assertEquals("Rejected",funRide.accept(bicycleFromSpec1));

    }



}
