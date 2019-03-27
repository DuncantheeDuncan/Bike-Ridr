package bicycles;
import java.util.*;

public class FunRide {
    private int MaxNUm;
    private  int count = 0;
    private List<Bicycle> bicycles = new ArrayList<>();

   public FunRide(int maxBikes){
       this.MaxNUm = maxBikes;

   }
   public  String accept(Bicycle bicycle){
       if(  bicycles.size() >= MaxNUm){

           return "Rejected";
       }
       else {
           bicycles.add(bicycle);
           return "Accepted";
       }

   }
   public int getCountForType(BicycleType bicycleType) {
       for (Bicycle i : bicycles) {

           if(i.getBicycleType() == bicycleType){
               count +=1;

           }
       }
       return count;

   }
   public int getEnteredCount(){

    return bicycles.size();

   }
}
