package collection_002;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        ArrayList<MyClass> arrayListMyClass = new ArrayList<>();

        MyClass object = new MyClass("Алексей", 12);
        arrayListMyClass.add(new MyClass("Алексей", 12));
        arrayListMyClass.add(new MyClass("Владислав", 34));
        arrayListMyClass.add(new MyClass("Сергей", 21));
        arrayListMyClass.add(object);


        for (MyClass element : arrayListMyClass) {
            System.out.println("Имя : " + element.getName() + ", возраст : " + element.getAge());
        }

        for (MyClass person : arrayListMyClass)
        {
            System.out.println(person);
        }

        System.out.println(arrayListMyClass.contains(new MyClass("Алексей", 12)));
        System.out.println(arrayListMyClass.contains(object));

        for (MyClass person : arrayListMyClass)
        {
            if ("Алексей".equals(person.getName()) && 12 == person.getAge())
            {
                System.out.println(true);
                break;
            }
        }

        MyClass[] array = new MyClass[arrayListMyClass.size()];
        arrayListMyClass.toArray(array);

        System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.binarySearch(array, object));

        ArrayList<MyClass> list = new ArrayList<>();

        for (MyClass cl : array)
            list.add(cl);
        System.out.println(list.size());


        //list.addAll(array);

        MyArrayList<MyClass> arrlist = new MyArrayList<>(array);
        for (int i = 0; i < arrlist.list.size(); i++) {
            System.out.println(arrlist.list.get(i));
        }
        System.out.println(arrlist);
    }
}

class MyArrayList<T> extends ArrayList {
    ArrayList<T> list;

    public MyArrayList(T[] array) {
        this.list = new ArrayList<>();
        for (T item : array)
            list.add(item);
    }

    @Override
    public String toString() {
        String str = "MyArrayList{ ";
        for (T item : list)
            str += item + ", ";
        return str + '}';
    }
}
