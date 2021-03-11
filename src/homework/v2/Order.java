package homework.v2;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private static int number = 0;
    ArrayList<Meal> orderList;
    String waiter;
    private boolean isCompleted = false;
    private final int ID;

    public Order(String waiter) {
        this.waiter = waiter;
        orderList = new ArrayList<>();
        ID = number;
        number++;

    }

    public static int getNumber() {
        return number;
    }

    public void changeState() {
        this.isCompleted = !this.isCompleted;
    }

    public double calculate() {
        double sum = 0;
        for (Meal meal : orderList) {
            sum += meal.getPrice();
        }
        return sum * 1.1;
    }

    @Override
    public String toString() {
        String bill = "\n#" + (ID + 1) + "\n" + new Date().toGMTString();
        if (isCompleted)
            bill += "\nCompleted\n" + calculate();
        else
            bill += "\nNot completed";

        bill += "\n" + waiter;

        return bill;
    }

    public void add(Meal meal) {
        if (!isCompleted) {
            this.orderList.add(meal);
        }
    }
}
