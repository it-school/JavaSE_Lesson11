package ClassWork_v2;

import java.util.ArrayList;

public class Menu {
    ArrayList<Meal> menu;
    String title;

    public Menu(String title) {
        this.title = title;
        this.menu = new ArrayList<>();
    }

    public void add(Meal meal) {
        this.menu.add(meal);
    }

    public void remove(String meal) {
        for (int i = 0; i < this.menu.size(); i++) {
            if (this.menu.get(i).getTitle().toLowerCase().contains(meal.toLowerCase()))
                this.menu.remove(i);
        }
    }


    @Override
    public String toString() {
        String strmenu = this.title + " menu:\n";
        for (Meal meal : menu) {
            strmenu += meal + "\n";
        }
        return strmenu;
    }
}
