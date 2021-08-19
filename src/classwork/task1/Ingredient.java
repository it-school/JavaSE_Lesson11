package classwork.task1;

public class Ingredient {
   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Units getUnit() {
      return unit;
   }

   public void setUnit(Units unit) {
      this.unit = unit;
   }

   public String getInfo() {
      return info;
   }

   public void setInfo(String info) {
      this.info = info;
   }

   private String title;
   private Units unit;
   private String info;

   public Ingredient(String title, Units unit, String info) {
      this.title = title;
      this.unit = unit;
      this.info = info;
   }

   @Override
   public String toString() {
      return "Ingredient{" +
              "title='" + title + '\'' +
              ", unit=" + unit +
              ", info='" + info + '\'' +
              '}';
   }
}
