package bicycles;

public abstract class BicycleBase implements Bicycle {
    private int speed = 0;
    protected void changeSpeed(int num){
        speed += num;/*missing!! code*/
    }


    public int currentSpeed() {
        return  speed;
    }


    public void stop() {
        speed = 0;

    }

}
