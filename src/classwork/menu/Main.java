package classwork.menu;

import java.time.LocalDateTime;

public class Main {
   public static void main(String[] args) {
//      1) Создать класс Ингредиент блюда (название, кол-во, единица измерения, краткое описание)
//      2) Создать класс Блюдо (название, список ингредиентов, краткое описание, кол-во калорий, время приготовления).
//      3) Создать класс Заказ (id, время заказа, безразмерный список блюд (экземпляров класса Блюдо), отметка о выполнении).
//      4) Создать класс Заказы, содержащий безразмерный список заказов (экземпляров класса Заказ).
//      5) Для классов Заказ реализовать возможность добавления, удаления, изменения состояния).
//      6) Для класса Заказы реализовать возможность поиска (по времени, по наличию блюд с частичным совпадением названия, невыполненных заказов).
//      7) Использовать обработку исключительных ситуаций при работе с классами.
//      8) Реализовать проверки корректности значений для всех Setter'ов.

      System.out.println("\nIngredients by one:\n");
      Ingredient sugar = new Ingredient("Sugar", 5, Units.gramm, "brown");
      Ingredient coffee = new Ingredient("Coffee", 3, Units.gramm, "Brazil");
      Ingredient tea1 = new Ingredient("Tea", 3, Units.gramm, "green");
      Ingredient tea2 = new Ingredient("Tea", 3, Units.gramm, "black");
      Ingredient milk = new Ingredient("Milk", 5, Units.tea_spoon, "3.2%");
      Ingredient water = new Ingredient("Water", 1, Units.glass, "clean");
      System.out.println(sugar);
      System.out.println(coffee);
      System.out.println(tea1);
      System.out.println(tea2);
      System.out.println(milk);
      System.out.println(water);


      System.out.println("\nMeals by one:\n");
      Meal coffeeWithMilk = new Meal("Coffee with milk", "Coffee with milk", 50, 5, coffee, milk, water, sugar);
      Meal americano = new Meal("Coffee americano", "Coffee americano with milk", 50, 5, coffee, milk, water, water, sugar);
      Meal greenTea = new Meal("Tea (green)", "Tea (green)", 5, 3, tea1, water);
      System.out.println(coffeeWithMilk);
      System.out.println(americano);
      System.out.println(greenTea);

      System.out.println("\nOrders by one:\n");
      Order order1 = new Order(1, coffeeWithMilk, americano);
      Order order2 = new Order(2, greenTea);
      Order order3 = new Order(3, greenTea, greenTea, greenTea, greenTea);
      System.out.println(order1);
      System.out.println(order2);
      System.out.println(order3);


      System.out.println("\nOrders list:\n");
      Orders orders = new Orders();
      orders.addOrder(order1);
      orders.addOrder(order3);
      orders.addOrder(order2);
      System.out.println(orders);


      orders.getOrderbyID(3).setState(State.finished);
      System.out.println("\n\nSearch for finished orders:\n");
      try {
         System.out.println(orders.find(State.finished));
      } catch (Exception e) {
         System.out.println("Error while searching by state!");
      }


      System.out.println("\n\nSearch for orders with tea:\n");
      try {
         System.out.println(orders.find("TEA"));
      } catch (Exception e) {
         System.out.println("Error while searching by title!");
      }


      System.out.println("\n\nSearch for orders placed in 21:44:\n");
      try {
         System.out.println(orders.find(LocalDateTime.of(2021, -11, 23, 21, 44)));
      } catch (Exception e) {
         System.out.println("Error while searching by title!");
      }


      System.out.println("\n\nSearch for orders placed now():\n");
      try {
         System.out.println(orders.find(LocalDateTime.now()));
      } catch (Exception e) {
         System.out.println("Error while searching by title!");
      }
   }
}
