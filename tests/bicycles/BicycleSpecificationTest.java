package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleSpecificationTest {
    @Test
    public void testingTheRoadBikespecToSeeIf(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideFastAndFurious bikeRideOne = new BikeRideFastAndFurious(bicycle);
        bikeRideOne.ride();
        System.out.println(roadBikeSpec.getAccelerationSpeed());//prints 11
        System.out.println(roadBikeSpec.getBrakeSpeed());//prints -4
        System.out.println(bikeRideOne.currentSpeed());
        assertEquals(bikeRideOne.currentSpeed(),36);


    }

    @Test
    public void testingTheMountainBike(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3,BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideMoreBrakes bikeRideTwo = new BikeRideMoreBrakes(mountainBike);
        bikeRideTwo.ride();
        System.out.println(mountainBikeSpec.getAccelerationSpeed());//prints 5
        System.out.println(mountainBikeSpec.getBrakeSpeed());//prints -3
        System.out.println(bikeRideTwo.currentSpeed());
        assertEquals(bikeRideTwo.currentSpeed(),14);

    }

    @Test
    public void tesTheTandemBicModel(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12,-7,BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemBikeSpec);
        BikeRideMoreCautious bikeRideThreeTandembike = new BikeRideMoreCautious(tandem);
        bikeRideThreeTandembike.ride();
        System.out.println(tandemBikeSpec.getAccelerationSpeed());//add 12
        System.out.println(tandemBikeSpec.getBrakeSpeed());// prints -7
        System.out.println(bikeRideThreeTandembike.currentSpeed());
        assertEquals(bikeRideThreeTandembike.currentSpeed(),34);

    }

}
