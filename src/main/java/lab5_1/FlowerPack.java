package lab5_1;

import lombok.Getter;
import lombok.Setter;

public class FlowerPack {
    @Getter @Setter
    private Flower flower;
    @Getter @Setter
    private int amount;

    public double getPrice(){
        return flower.getPrice()*amount;
    }
}
