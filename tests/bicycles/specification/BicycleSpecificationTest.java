package bicycles.specification;
import bicycles.BicycleType;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BicycleSpecificationTest {
    @Test
    public void testingTheRoadBikeSpec(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        assertEquals(roadBikeSpec.getAccelerationSpeed(), 11);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
       assertEquals(roadBikeSpec.getBicycleType(), BicycleType.RoadBike);
    }
    @Test
    public void testingTheMountainBikeSpec(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3,BicycleType.MountainBike);
        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);
        assertEquals(mountainBikeSpec.getBrakeSpeed(), -3);
        assertEquals(mountainBikeSpec.getBicycleType(), BicycleType.MountainBike);
    }
    @Test
    public void tesTheTandemBikeSpec(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12,-7,BicycleType.Tandem);
        assertEquals(tandemBikeSpec.getAccelerationSpeed(), 12);
        assertEquals(tandemBikeSpec.getBrakeSpeed(), -7);
        assertEquals(tandemBikeSpec.getBicycleType(), BicycleType.Tandem);
    }
}
