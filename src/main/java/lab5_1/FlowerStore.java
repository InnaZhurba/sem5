package lab5_1;

import lombok.Getter;
import lombok.Setter;

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

    /*@Override
    public void CreditCardPaymentStrategy(double price) {
        System.out.println("Pay by credit card: "+price);
    }

    @Override
    public void PayPalPaymentStrategy(double price) {
        System.out.println("Pay by PayPal: "+price);
    }*/
}
