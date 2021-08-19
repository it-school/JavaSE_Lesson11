package classwork.task1;

import java.util.ArrayList;

public class Meal {
   private String title;
   private ArrayList<Ingredient> ingredients;
   private String info;
   private int time;

   @Override
   public String toString() {
      return "Meal{" +
              "title='" + title + '\'' +
              ", ingredients=" + ingredients +
              ", info='" + info + '\'' +
              ", time=" + time +
              '}';
   }

   public Meal(String title, String info, int time) {
      this.title = title;
      this.ingredients = new ArrayList<>();
      this.info = info;
      this.time = time;
   }

   public Meal(String title, String info, int time, Ingredient ... ingredients) {
      this.title = title;
      this.ingredients = new ArrayList<>();
      this.info = info;
      this.time = time;

      for (Ingredient item : ingredients) {
         this.ingredients.add(item);
      }
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public ArrayList<Ingredient> getIngredients() {
      return ingredients;
   }

   public void setIngredients(ArrayList<Ingredient> ingredients) {
      this.ingredients = ingredients;
   }

   public String getInfo() {
      return info;
   }

   public void setInfo(String info) {
      this.info = info;
   }

   public int getTime() {
      return time;
   }

   public void setTime(int time) {
      this.time = time;
   }
}
