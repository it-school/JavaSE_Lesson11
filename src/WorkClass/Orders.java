package WorkClass;

import java.util.ArrayList;

public class Orders {
    ArrayList<Order> orders;
    String title;

    public Orders(String title) {
        this.title = title;
        orders = new ArrayList<>();
    }

    public void add(Order order) {
        this.orders.add(order);

    }

    @Override
    public String toString() {
        return "\n" + title + " {" + orders + "'}\n Total: " + Order.getNumber();
    }
}
