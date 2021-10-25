package lab5_1.Decorator;

import lab5_1.Items;

public class BasketDecorator extends ItemDecorator {
    //Items item;
    public BasketDecorator(Items item) {
        super(item);
    }
    public double price(){
        return 4 + super.price();
    }
    public String getDescription(){
        return super.getDescription();
    }
}
