package bicycles;

public interface Bicycle {

     void accelerate();
     void brake();
     int currentSpeed();
     void stop();
     BicycleType  getBicycleType();


}
     /*public BicycleType getBicycleType(){
          return bicycleType;
     }*/
