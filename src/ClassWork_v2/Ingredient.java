package ClassWork_v2;

public class Ingredient {
    String title;
    int weight;
    int calories;

    public Ingredient(String title, int weight, int calories) {
        this.title = title;
        this.weight = weight;
        this.calories = calories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight >= 0 ? weight : -1;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories >= 0 ? calories : -1;
    }

    @Override
    public String toString() {
        if (this.calories == -1 || this.weight == -1)
            return "Incorrect ingredient";
        else
            return title + " {" +
                    "weight=" + weight +
                    ", calories=" + calories +
                    '}';
    }
}
