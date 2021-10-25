package lab5_1.Decorator;

import lab5_1.ItemDecorator;
import lab5_1.Items;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Items item) {
        super(item);
    }
    @Override
    public double price(){
        return 13 + super.price();
    }
    @Override
    public String getDescription(){
        return super.getDescription();
    }
}
