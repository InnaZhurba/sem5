package lab5_1.Delivery;

import lab5_1.Delivery.Delivery;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public boolean delivery() {
        System.out.println("Post delivery.");
        return true;
    }
}
