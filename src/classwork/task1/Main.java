package classwork.task1;

public class Main {

   public static void main(String[] args) {
      Ingredient ingredient1 = new Ingredient("tea", Units.spoon, "Georgian");
      Ingredient ingredient2 = new Ingredient("sugar", Units.spoon, "Cuba");
      Ingredient ingredient3 = new Ingredient("lemon", Units.gramm, "Cuba");

      Meal tea = new Meal("Tea from Georgia", "...", 3);
      tea.getIngredients().add(ingredient1);
      tea.getIngredients().add(ingredient2);
      tea.getIngredients().add(ingredient3);
      Meal tea_without_lemon = new Meal("Tea from Georgia", "without lemon", 3, ingredient1, ingredient2, ingredient2, ingredient2);

      System.out.println(tea);
      System.out.println(tea_without_lemon);
   }
}
