package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleSpecificationTest {
    @Test
    public void testingTheRoadBikespecToSeeIf(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOneRoadbike bikeRideOne = new BikeRideOneRoadbike(bicycle);
        bikeRideOne.ride();
        System.out.println(roadBikeSpec.getAccelerationSpeed());//prints 11
        System.out.println(roadBikeSpec.getBrakeSpeed());//prints -4
        System.out.println(bikeRideOne.currentSpeed());
        assertEquals(bikeRideOne.currentSpeed(),36);


    }

    @Test
    public void testingTheMountainBike(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideTwoMountainBike bikeRideTwo = new BikeRideTwoMountainBike(mountainBike);
        bikeRideTwo.ride();
        System.out.println(mountainBikeSpec.getAccelerationSpeed());//prints 5
        System.out.println(mountainBikeSpec.getBrakeSpeed());//prints -3
        System.out.println(bikeRideTwo.currentSpeed());
        assertEquals(bikeRideTwo.currentSpeed(),14);




    }

    @Test
    public void tesTheTandemBicModel(){

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12,-7);
        Bicycle tandem = new BicycleFromSpec(tandemBikeSpec);
        BikeRideThreeTandembike bikeRideThreeTandembike = new BikeRideThreeTandembike(tandem);
        bikeRideThreeTandembike.ride();
        System.out.println(tandemBikeSpec.getAccelerationSpeed());//add 12
        System.out.println(tandemBikeSpec.getBrakeSpeed());// prints -7
        System.out.println(bikeRideThreeTandembike.currentSpeed());
        assertEquals(bikeRideThreeTandembike.currentSpeed(),34);

    }

}
