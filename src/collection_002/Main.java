package collection_002;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<MyClass> arrayListMyClass = new ArrayList<>();

        arrayListMyClass.add(new MyClass("Алексей", 12));
        arrayListMyClass.add(new MyClass("Владислав", 34));
        arrayListMyClass.add(new MyClass("Сергей", 21));

        for (MyClass element : arrayListMyClass) {
            System.out.println("Имя : " + element.getName() + ", возраст : " + element.getAge());
        }
    }
}
