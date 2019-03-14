package bicycles;

public abstract class BicycleBase implements Bicycle {
    private int speed = 0;
    protected int changeSpeed(int a){

        return speed += a;/*missing!! code*/
    }


    public int currentSpeed() {
        return  speed;
    }


    public void stop() {
        speed = 0;

    }


}
