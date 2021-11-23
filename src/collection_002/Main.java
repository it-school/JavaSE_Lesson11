package collection_002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
       List<Person> arrayListMyClass = new ArrayList<>();

        Person human = new Person("Алексей", 12);
       arrayListMyClass.add(human);
       arrayListMyClass.add(new Person("Владислав", 34));
       arrayListMyClass.add(new Person("Алексей", 12));
       arrayListMyClass.add(new Person("Сергей", 21));


       for (Person element : arrayListMyClass) {
          System.out.println("Имя : " + element.getName() + ", возраст : " + element.getAge());
       }

       for (Person person : arrayListMyClass) {
          System.out.println(person);
       }

       System.out.println(arrayListMyClass.get(0).hashCode());
       System.out.println(arrayListMyClass.get(2).hashCode());

       System.out.println(arrayListMyClass.get(0).compareTo(arrayListMyClass.get(2)));


       System.out.println("------------------------------");

       System.out.println(arrayListMyClass.contains(new Person("Алексей", 12)));
       System.out.println(arrayListMyClass.contains(human));


       boolean result = false;
       for (Person person : arrayListMyClass) {
          if (person.getName().equals("Алексей") && person.getAge() == 12) {
                result = true;
                break;
            }
        }
       System.out.println(result);
       System.out.println(arrayListMyClass.indexOf(human));

        Person[] array = new Person[arrayListMyClass.size()];
        arrayListMyClass.toArray(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, human));

       List<Person> list = new ArrayList<>();

        for (Person cl : array) {
            list.add(cl);
        }
        System.out.println(list.size());


        //list.addAll(array);

        MyArrayList<Person> arrlist = new MyArrayList<>(array);
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
           str += "(" + item + "), ";
        return str + '}';
    }
}
