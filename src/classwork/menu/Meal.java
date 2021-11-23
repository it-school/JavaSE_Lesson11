package classwork.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Информация о блюде в заведении
 */
public class Meal {
   private String title;                  //название
   private List<Ingredient> ingredients;  // список ингредиентов
   private String description;            // краткое описание
   private int caloriesNumber;            // кол-во калорий
   private int timeOfPrepareInMinutes;    // время приготовления

   public Meal(String title, String description, int caloriesNumber, int timeOfPrepareInMinutes, Ingredient... ingredients) {
      this.setTitle(title);
      this.ingredients = new ArrayList<>();

//      for (Ingredient ingredient : ingredients) {
//         this.ingredients.add(ingredient);
//      }
      Collections.addAll(this.ingredients, ingredients);

      this.setDescription(description);
      this.setCaloriesNumber(caloriesNumber);
      this.setTimeOfPrepareInMinutes(timeOfPrepareInMinutes);
   }

   public String getTitle() {
      return title;
   }

   private void setTitle(String title) {
      this.title = title.strip();
   }

   public List<Ingredient> getIngredients() {
      return ingredients;
   }

   private void setIngredients(List<Ingredient> ingredients) {
      this.ingredients = ingredients;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description.strip();
   }

   public int getCaloriesNumber() {
      return caloriesNumber;
   }

   private boolean setCaloriesNumber(int caloriesNumber) {
      if (caloriesNumber <= 0)
         return false;

      this.caloriesNumber = caloriesNumber;
      return true;
   }

   public int getTimeOfPrepareInMinutes() {
      return timeOfPrepareInMinutes;
   }

   private void setTimeOfPrepareInMinutes(int timeOfPrepareInMinutes) {
      this.timeOfPrepareInMinutes = timeOfPrepareInMinutes;
   }

   @Override
   public String toString() {
      return "\n\t\t" + title + " (" + description + "), ingredients: " + ingredients + ", " + caloriesNumber + " cals, prepare time:" + timeOfPrepareInMinutes;
   }
}