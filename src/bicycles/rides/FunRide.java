package bicycles.rides;
import bicycles.Bicycle;
import bicycles.BicycleType;
import java.util.*;
public class FunRide {
    private int MaxNUm;
    private  int count = 0;
    private List<Bicycle> bicycles = new ArrayList<>();

   public FunRide(int maxBikes){
       this.MaxNUm = maxBikes;
   }

   public  String accept(Bicycle bicycle){
       if( bicycles.size() < MaxNUm && !bicycles.contains(bicycle)){
           bicycles.add(bicycle);
           return "Accepted";
       }
       else {
           return "Rejected";
       }

   }

   public int getCountForType(BicycleType bicycleType) {
       for (Bicycle bicycle : bicycles) {
           if(bicycle.getBicycleType() == bicycleType){
               count += 1;
           }
       }
       return count;
   }
   public int getEnteredCount(){
       return bicycles.size();
   }
}
