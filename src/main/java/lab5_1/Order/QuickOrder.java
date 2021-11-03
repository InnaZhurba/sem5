package lab5_1.Order;

public enum QuickOrder {
    ROSE_BUCKET, TULIP_BUCKET, CAMOMILE_BUCKET;

    public static Order createOrder(QuickOrder quick_order){
        return new Order();
    }
}
