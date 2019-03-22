package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    /*@Test
    public void shouldAccellerate() {
//       (1)<-- represents CLASS --> Bicycle (2)<-- acts as --> object bicycle = new Bicycle();
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRideOne(roadBike);
        bikeRide.ride();

        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(),0);
    }*/

    /*@Test
    public void shouldAccellerate() {
//       (1)<-- represents CLASS --> Bicycle (2)<-- acts as --> object bicycle = new Bicycle();
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRideOne(roadBike);
        bikeRide.ride();

        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(),0);
    }*/
//    @Test
//    public void shouldAccelerate2(){
//        MountainBike mountainBike = new MountainBike();
//        BikeRide bikeRide = new BikeRide(mountainBike);
//        bikeRide.ride();
//
//        System.out.println(bikeRide.currentSpeed());
//        assertEquals(bikeRide.currentSpeed(),0);
//    }
    @Test
    public void testBikeOne(){
        MountainBike mountainBike = new MountainBike();
        BikeRideOneRoadbike bikeRideOne = new BikeRideOneRoadbike(mountainBike);
        bikeRideOne.ride();

        System.out.println(bikeRideOne.currentSpeed());
        assertEquals(bikeRideOne.currentSpeed(),14);


    }
    @Test
    public  void testBikeTwo(){
        Tandem tandem = new Tandem();
        BikeRideTwoMountainBike bikeRideTwo = new BikeRideTwoMountainBike(tandem);
        bikeRideTwo.ride();

        System.out.println(bikeRideTwo.currentSpeed());
        assertEquals(bikeRideTwo.currentSpeed(),34);

    }


    @Test
    public void testBikeThree(){
        RoadBike roadBike = new RoadBike();
        /*starting with the class that im going to test from
        * so you call it 'class' and reference it with
        * a new "variable" of some sort!(instance)
        * to new 'class' that you can use
        * #almost same as updating a variable in javascript
        * var a = a;.*/
        BikeRideThreeTandembike bikeRideThree = new BikeRideThreeTandembike(roadBike);
        /*same applies as mentioned above the diff is we dealing
        with a ride class
        * but now the  parantaces of a ride bike
        * takes */
        bikeRideThree.ride();

        System.out.println(bikeRideThree.currentSpeed());
        assertEquals(bikeRideThree.currentSpeed(),36);

    }
}
