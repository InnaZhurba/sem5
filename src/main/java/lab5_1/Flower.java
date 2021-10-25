package lab5_1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@ToString
public class Flower extends Items {
    @Getter @Setter
    byte[] color = new byte[3];
    @Getter @Setter
    int num_of_leafs;
    @Getter
    FlowerType Type; // композиція
    @Getter @Setter
    double length;
    @Getter @Setter
    double price;

    public void setColor(byte[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType type){
        this.Type = type;
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        return "Flower description";
    }
}
