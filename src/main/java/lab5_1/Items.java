package lab5_1;

import lombok.Getter;
import lombok.Setter;

public abstract class Items {
    @Setter
    String description;

    public abstract double price();

    public abstract String getDescription();
}
