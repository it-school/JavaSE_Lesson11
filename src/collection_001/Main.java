package collection_001;

import java.util.ArrayList;
import java.util.Arrays;

class Main
{
	public static void main(String[] args)
	{
		int a = 5;
		Integer b = 4;
		a = b;  // unboxing
		b = a;  // boxing
		Integer[] arrayInt = new Integer[10];
		ArrayList<Integer> arrayListInteger = new ArrayList<>();
		//arrayListInteger.ensureCapacity(100000);
		arrayListInteger.add(1);
		arrayListInteger.add(2);
		arrayListInteger.add(3);
		arrayListInteger.add(4);
		arrayListInteger.add(1);

		System.out.printf("Коллекция (%d):\n", arrayListInteger.size());

		for (Integer element : arrayListInteger) {
			System.out.print(element + ", ");
		}

		System.out.println("\nRemove first 1:");
		arrayListInteger.remove((Integer) 1);
		System.out.println(Arrays.toString(arrayListInteger.toArray()));

		System.out.println("Remove next 1:");
		arrayListInteger.remove((Integer) 1);
		System.out.println(arrayListInteger.toString());

		System.out.println("Remove next 1:");
		System.out.println(arrayListInteger.remove((Integer) 1));
		System.out.println(arrayListInteger.toString());

		System.out.println(arrayListInteger.get(2));

		arrayInt = new Integer[arrayListInteger.toArray().length];
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = (Integer) arrayListInteger.toArray()[i];
		}
		System.out.println(arrayInt[2]);

		System.out.println("Current size: " + arrayListInteger.size());
		arrayListInteger.ensureCapacity(16);
		System.out.println("Current size: " + arrayListInteger.size());
	}
}