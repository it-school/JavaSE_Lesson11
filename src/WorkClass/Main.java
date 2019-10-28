package WorkClass;

public class Main {
    public static void main(String[] args) {
        Meal meal1 = new Meal("Shahlyk", 100);
        meal1.addIngredient(new Ingredient("Meat", 500, 300));
        meal1.addIngredient(new Ingredient("Lettuce", 50, 3));
        meal1.addIngredient(new Ingredient("Oil", 20, 180));

        Meal meal2 = new Meal("Sea shahlyk", 150);
        meal2.addIngredient(new Ingredient("Fish", 300, 300));
        meal2.addIngredient(new Ingredient("Lettuce", 50, 3));
        meal2.addIngredient(new Ingredient("Oil", 20, 180));

        Meal meal3 = new Meal("Vegetable shahlyk", 70);
        meal3.addIngredient(new Ingredient("Fish", 100, 300));
        meal3.addIngredient(new Ingredient("Oil", 20, 180));

        Menu menu = new Menu("Odessa");
        menu.add(meal1);
        menu.add(meal2);
        menu.add(meal3);
//        menu.remove("veg");
//        System.out.println(menu);

        System.out.println(menu);

        Order order1 = new Order("John");
        order1.add(meal1);
        order1.add(meal1);
        order1.add(meal2);

        System.out.println(order1);
        order1.changeState();
        System.out.println(order1);
        order1.add(meal3);
        System.out.println(order1);

        Order order2 = new Order("Valery");
        order2.add(meal3);
        order2.add(meal3);

        Orders orders = new Orders("At Samvel");
        orders.add(order1);
        orders.add(order2);
        System.out.println(orders);
    }
}
