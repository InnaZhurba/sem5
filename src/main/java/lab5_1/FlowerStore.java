package lab5_1;

import lombok.Getter;
import lombok.Setter;

import java.sql.Array;
import java.util.ArrayList;

public class FlowerStore {
    @Getter @Setter
    ArrayList<FlowerBucket> bucket = new ArrayList<>();

    public FlowerBucket search(Flower flower){
        for(FlowerBucket fb: bucket){
           if(fb.hasFlower(flower))
               return fb;
        }
        return null;
    }
}
