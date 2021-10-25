package lab5_1.Decorator;

import lab5_1.Items;

public class RibbonDecorator extends ItemDecorator {
    //Items item;
    public RibbonDecorator(Items item) {
        super(item);
    }

    public double price(){
        return 40 + super.price();
    }
    public String getDescription(){
        return super.getDescription();
    }
}
