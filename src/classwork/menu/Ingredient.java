package classwork.menu;

public class Ingredient {
   private String title;
   private int quantity;
   private Units units;
   private String description;

   public Ingredient(String title, int quantity, Units units, String description) {
      this.setTitle(title);
      this.setQuantity(quantity);
      this.setUnits(units);
      this.setDescription(description);
   }

   public String getTitle() {
      return title;
   }

   private void setTitle(String title) {
      this.title = title.strip();
   }

   public int getQuantity() {
      return quantity;
   }

   private boolean setQuantity(int quantity) {
      if (quantity <= 0)
         return false;
      this.quantity = quantity;
      return true;
   }

   public Units getUnits() {
      return units;
   }

   private void setUnits(Units units) {
      this.units = units;
   }

   public String getDescription() {
      return description;
   }

   private void setDescription(String description) {
      this.description = description.strip();
   }

   @Override
   public String toString() {
      return title + ", quantity=" + quantity +
              ", units=" + units +
              ", description='" + description + '\'';
   }
}
