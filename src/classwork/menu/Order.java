package classwork.menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
   private final List<Meal> meals; // безразмерный список блюд (экземпляров класса Блюдо)
   private final int tableNumber; // номер стола
   private int id; // id
   private LocalDateTime orderTime; // время заказа
   private State state; // статус заказа

   public Order(int tableNumber, Meal... meals) {
      this.orderTime = LocalDateTime.now();
      this.meals = new ArrayList<>();
      for (Meal meal : meals) {
         this.meals.add(meal);
      }
      this.tableNumber = tableNumber;
      this.state = State.inProgress;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public LocalDateTime getOrderTime() {
      return orderTime;
   }

   public void setOrderTime(LocalDateTime orderTime) {
      this.orderTime = orderTime;
   }

   public List<Meal> getMeals() {
      return meals;
   }

   public State getState() {
      return state;
   }

   public void setState(State state) {
      this.state = state;
   }

   @Override
   public String toString() {
      return "Order " + id +
              ": orderTime=" + orderTime.getHour() + ":" + orderTime.getMinute() +
              ", meals=" + meals +
              ", state=" + state +
              ", tableNumber=" + tableNumber +
              "'}\n";
   }
}
