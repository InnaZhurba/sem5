package lab5_1;

public class ItemDecorator extends Items{

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
        return null;
    }
}
