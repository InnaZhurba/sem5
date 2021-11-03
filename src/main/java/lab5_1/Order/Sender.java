package lab5_1.Order;

public class Sender implements User {
    int ID;
    @Override
    public void setID(int id) {
        ID = id;
    }

    @Override
    public void update(String status) {
        System.out.println(status);
    }
}
