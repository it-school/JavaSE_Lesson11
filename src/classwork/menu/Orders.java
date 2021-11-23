package classwork.menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Orders {
   private final List orders;
   private int ordersNumber;

   public Orders() {
      this.orders = new ArrayList();
      ordersNumber = 0;
   }

   public Order getOrderbyID(int id) {
      for (Object order : orders) {
         if (((Order) order).getId() == id)
            return (Order) order;
      }

      return null;
   }

   public void addOrder(Order order) {
      ordersNumber++;
      order.setId(ordersNumber);
      this.orders.add(order);
   }

   public void addOrder(Order order, int id) {
      order.setId(id);
      this.orders.add(order);
   }

   @Override
   public String toString() {
      if (orders.size() == 0)
         return "No orders at all";

      return "Orders{\n" + orders + "\n}";
   }

   /**
    * поиск по состоянию
    *
    * @param state искомое состояние
    *
    * @return объект класса Orders, содержащий список подходящих по статусу заказов
    */
   public Orders find(State state) {
      Orders foundOrders = new Orders();
      for (Object order : orders) {
         Order orderNew = (Order) order;
         if (orderNew.getState() == state) {
            foundOrders.addOrder(orderNew, orderNew.getId());
         }
      }

      return foundOrders;
   }

   /**
    * поиск по наличию блюд с частичным совпадением названия
    *
    * @param title часть или полное искомое название
    *
    * @return объект класса Orders, содержащий список подходящих по названию заказов
    */
   public Orders find(String title) {
      Orders foundOrders = new Orders();

      nextMeal:
      for (Object order : this.orders) {
         Order orderNew = (Order) order;
         for (Meal meal : orderNew.getMeals()) {
            if (meal.getTitle().toLowerCase().contains(title.toLowerCase()) || meal.getDescription().toLowerCase().contains(title.toLowerCase())) {
               foundOrders.addOrder(orderNew, orderNew.getId());
               continue nextMeal;
            }
         }
      }

      return foundOrders;
   }

   /**
    * поиск по времени
    *
    * @param searchTime искомое время
    *
    * @return объект класса Orders, содержащий список подходящих по времени заказов
    */
   public Orders find(LocalDateTime searchTime) {
      Orders foundOrders = new Orders();
      for (Object order : orders) {
         Order orderNew = (Order) order;
         if (orderNew.getOrderTime().getHour() == searchTime.getHour() && orderNew.getOrderTime().getMinute() == searchTime.getMinute()) {
            foundOrders.addOrder(orderNew, orderNew.getId());
         }
      }

      return foundOrders;
   }

}
