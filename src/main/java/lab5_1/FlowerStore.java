package lab5_1;

import java.sql.Array;
import java.util.ArrayList;

public class FlowerStore {
    ArrayList<FlowerBucket> bucket = new ArrayList<>();

    public FlowerBucket search(Flower flower){
        for(FlowerBucket fb: bucket){
           if(fb.hasFlower(flower))
               return fb;
        }
        return null;
    }
}
