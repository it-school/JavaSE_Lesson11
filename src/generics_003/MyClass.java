package generics_003;

public class MyClass {
   static <T> void Method(T num) {
      if (num instanceof Double) {
         System.out.println("Число имеет тип Double");
      } else if (num instanceof Integer) {
         System.out.println("Число имеет тип Integer");
      } else if (num instanceof Float) {
         System.out.println("Число имеет тип Float");
      } else if (num instanceof Byte) {
         System.out.println("Число имеет тип Byte");
         System.out.println(num);
        }
        else if (num instanceof String) {
	        System.out.println("String: " + Integer.valueOf(num.toString()));
        }
        else {
	        System.out.println("Число имеет другой тип: " + num.getClass());
        }
    }
}
