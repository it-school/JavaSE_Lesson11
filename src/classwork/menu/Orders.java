package classwork.menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * БД заказов заведения
 */
public class Orders {
   /**
    * список заказов
    */
   private final List<Order> orders;

   /**
    * номер последнего сделанного заказа
    */
   private int lastOrderNumber;

   public Orders() {
      this.orders = new ArrayList<>();
      lastOrderNumber = 0;
   }

   /**
    * Поиск заказа по идентификатору
    *
    * @param id идентификатор
    *
    * @return найденный заказ
    */
   public Order getOrderbyID(int id) {
      for (Order order : orders) {
         if (order.getId() == id)
            return order;
      }

      return null;
   }

   /**
    * Добавление заказа в список
    *
    * @param order объект с информацией о заказе
    */
   public void addOrder(Order order) {
      lastOrderNumber++;
      order.setId(lastOrderNumber);
      this.orders.add(order);
   }

   /**
    * Добавление заказа в список с указанием идентификатора
    *
    * @param order объект с информацией о заказе
    * @param id    идентификатор заказа
    */
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
      for (Order order : orders) {
         if (order.getState() == state) {
            foundOrders.addOrder(order, order.getId());
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
      for (Order order : this.orders) {
         for (Meal meal : order.getMeals()) {
            if (meal.getTitle().toLowerCase().contains(title.toLowerCase()) || meal.getDescription().toLowerCase().contains(title.toLowerCase())) {
               foundOrders.addOrder(order, order.getId());
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
      for (Order order : orders) {
         if (order.getOrderTime().getHour() == searchTime.getHour() && order.getOrderTime().getMinute() == searchTime.getMinute()) {
            foundOrders.addOrder(order, order.getId());
         }
      }

      return foundOrders;
   }
}