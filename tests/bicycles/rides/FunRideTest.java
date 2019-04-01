package bicycles.rides;
import bicycles.BicycleType;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FunRideTest {
    @Test
    public void getCountForTypeTest(){
       FunRide funRide = new FunRide(9);
        BicycleSpecification roadBike = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(15,-3, BicycleType.MountainBike);
        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.Tandem);
        BicycleFromSpec bicycleFromSpec1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec bicycleFromSpec4 = new BicycleFromSpec(roadBike);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(tandemBike);
        BicycleFromSpec bicycleFromSpec5 = new BicycleFromSpec(tandemBike);
        BicycleFromSpec bicycleFromSpec6 = new BicycleFromSpec(tandemBike);
        funRide.accept(bicycleFromSpec5);
        funRide.accept(bicycleFromSpec3);
        funRide.accept(bicycleFromSpec6);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec4);
        funRide.accept(bicycleFromSpec1);
        assertEquals(3,funRide.getCountForType(BicycleType.Tandem));
        assertEquals(4,funRide.getCountForType(BicycleType.MountainBike));
        assertEquals(6,funRide.getCountForType(BicycleType.RoadBike));
    }
    @Test
    public void getEnteredCountTest(){
        FunRide funRide = new FunRide(9);
        BicycleSpecification roadBike = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(15,-3, BicycleType.MountainBike);
        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.Tandem);
        BicycleFromSpec bicycleFromSpec1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(tandemBike);
        BicycleFromSpec bicycleFromSpec4 = new BicycleFromSpec(tandemBike);
        BicycleFromSpec bicycleFromSpec5 = new BicycleFromSpec(tandemBike);
        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec1);
        funRide.accept(bicycleFromSpec2);
        funRide.accept(bicycleFromSpec3);
        funRide.accept(bicycleFromSpec4);
        funRide.accept(bicycleFromSpec5);
        funRide.accept(bicycleFromSpec5);
        assertEquals(5,funRide.getEnteredCount());
    }
    @Test
    public void accept(){
        FunRide funRide = new FunRide(3);
        BicycleSpecification roadBike = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(15,-3, BicycleType.MountainBike);
        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.Tandem);
        BicycleFromSpec bicycleFromSpec1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec bicycleFromSpec4 = new BicycleFromSpec(roadBike);
        BicycleFromSpec bicycleFromSpec2 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec bicycleFromSpec3 = new BicycleFromSpec(tandemBike);
        funRide.accept(bicycleFromSpec4);
        funRide.accept(bicycleFromSpec4);
        funRide.accept(bicycleFromSpec4);
        funRide.accept(bicycleFromSpec4);
        funRide.accept(bicycleFromSpec3);
        assertEquals(funRide.accept(bicycleFromSpec4),"Rejected");
    }
}
