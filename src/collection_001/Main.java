package collection_001;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[]args){
        int a = 5;
        Integer b = 4;
        a = b;  // unboxing
        b = a;  // boxing
        Integer [] arrayInt = new Integer[10];
        ArrayList<Integer> arrayListInteger = new ArrayList();

        arrayListInteger.add(1);
        arrayListInteger.add(2);
        arrayListInteger.add(3);
        arrayListInteger.add(1);

        System.out.printf("Коллекция (%d):\n" , arrayListInteger.size());

        for (Integer element : arrayListInteger) {
            System.out.print(element + ", ");
        }
        System.out.println();

        int n = 0;
        arrayListInteger.remove((Integer) 1);

        System.out.println(Arrays.toString(arrayListInteger.toArray()));
        System.out.println(arrayListInteger.toString());

        System.out.println(arrayListInteger.get(2));
        System.out.println(arrayListInteger.toArray()[2]);

        arrayListInteger.ensureCapacity(16);
        System.out.println(arrayListInteger.size());
    }
}
