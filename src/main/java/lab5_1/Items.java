package lab5_1;

import lombok.Getter;
import lombok.Setter;

public abstract class Items {

    @Getter @Setter
    String description;

    /*public String getDescription() {
        return description;
    }*/
    public abstract double price();

    public void buy(Flower flower){
        //flowerBucket = flowerStore.search(flower);
    }

    public abstract String getDescription();
}
