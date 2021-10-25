package lab5_1.Delivery;

import lab5_1.Delivery.Delivery;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public boolean delivery() {
        System.out.println("DHL delivery.");
        return true;
    }
}
