package lab5_1;

import lombok.Getter;

import java.util.ArrayList;

public class FlowerBucket {
    @Getter
    ArrayList<FlowerPack> bucket= new ArrayList<>();
    public void addFlowerPack(FlowerPack flowerPack){
        bucket.add(flowerPack);
    }
    public double getPrice(){
        double price =0;

        for(FlowerPack flowerPack: bucket){
            price += flowerPack.getFlower().getPrice()+flowerPack.getAmount();//закон Деметри - не правильно робити n.n().n()...
        }
        return price;
    }
    public boolean hasFlower(Flower fl){
        for(FlowerPack flowerPack: bucket){
            if(fl.equals(flowerPack.getFlower()))
                return true;
        }
        return false;
    }
}
