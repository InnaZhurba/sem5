package lab5_1.Decorator;

import lab5_1.Items;

public class ItemDecorator extends Items {

private Items item;
    public ItemDecorator(Items item){
        this.item = item;
    }

    @Override
    public double price() {
        return item.price();
    }
    @Override
    public String getDescription() {
        return "Items description";
    }//items.getDescription();
}
