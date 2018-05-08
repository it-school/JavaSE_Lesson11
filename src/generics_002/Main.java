package generics_002;

public class Main {
    static public void main(String[] args) {
        Number q = 123f;
        MyClass<String, Number> instance = new MyClass<>("Hello from first instance", q);
        System.out.println(instance.getField1());
        System.out.println(instance.getField2());
        instance.info();
        System.out.println();

        MyClass<Integer, String> instance2 = new MyClass<>(123, "Hello from second instance");
        System.out.println(instance2.getField1());
        System.out.println(instance2.getField2());
        instance2.info();
        System.out.println();

        MyClass<String, String> instance3 =  new MyClass<>("Hello from third instance - 1", "Hello from third instance - 2");
        System.out.println(instance3.getField1());
        System.out.println(instance3.getField2());
        instance3.info();
        System.out.println();

        MyClass<Double, String> instance4 =  new MyClass<>(0.123, "Hello from fourth instance");
        System.out.println(instance4.getField1());
        System.out.println(instance4.getField2());
        instance4.info();
    }
}
