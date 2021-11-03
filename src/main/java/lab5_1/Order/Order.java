package lab5_1.Order;

import java.util.List;

public class Order {
    static public int counter =0;
    private List<User> users;

    //public void
    public void addUser(User user){
        user.setID(counter);
        users.add(user);
        counter++;
    }
    public void removeUser(User user){

        users.remove(user);
    }
    public void notifyUsers(String status){
        for(User user:users){
            user.update(status);
        }
    }
    public void deliver(){
        String status = "updated";
        notifyUsers(status);
    }
    public boolean pay(){
        return true;
    }
    public void order(){
        if(pay())
            deliver();
    }
}
