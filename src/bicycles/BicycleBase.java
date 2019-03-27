package bicycles;

public abstract class BicycleBase implements Bicycle {
    private int speed = 0;
    protected void changeSpeed(int bikeSpeed){
        if(speed < 0){
            speed = 0;
        }
        speed += bikeSpeed;
    }


    public int currentSpeed() {
        if(speed < 0){
            speed = 0;
        }
        return  speed;
    }


    public void stop() {
        speed = 0;

    }

}
