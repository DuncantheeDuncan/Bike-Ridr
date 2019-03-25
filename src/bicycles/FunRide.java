package bicycles;
import java.util.*;

public class FunRide {
    private int MaxNUm;
    private  int count = 0;
    private List<BicycleType> bicycles = new ArrayList<>();

   public FunRide(int maxBikes){
       this.MaxNUm = maxBikes;

   }
   public  void accept(BicycleType bicycleType){
       if(  bicycles.size() > MaxNUm){

           System.out.println("Reject");
       }
       else {
           bicycles.add(bicycleType);
           System.out.println("Accept");
       }

   }
   public int getCountForType(BicycleType bicycleType) {
       for (int i = 0; i < bicycles.size(); i++) {
           count = count + 1;



       }
       return count;

   }
   public int getEnteredCount(){

    return bicycles.size();

   }
}
