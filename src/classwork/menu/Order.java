package classwork.menu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Информация о заказе
 */
public class Order {
   private final List<Meal> meals; // безразмерный список блюд (экземпляров класса Блюдо)
   private final int tableNumber; // номер стола
   private int id; // id
   private LocalDateTime orderTime; // время заказа
   private State state; // статус заказа

   public Order(int tableNumber, Meal... meals) {
      this.orderTime = LocalDateTime.now();
      this.meals = new ArrayList<>();

//      for (Meal meal : meals) {
//         this.meals.add(meal);
//      }
      Collections.addAll(this.meals, meals);

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
      return "\n\tOrder " + id + ", table# " + tableNumber + " (started in " + orderTime.format(DateTimeFormatter.ofPattern("HH:mm")) + " - " + state + "): \n\t" + meals;
   }
}