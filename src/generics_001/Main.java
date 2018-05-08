package generics_001;

public class Main {
    static public void main(String[] args) {
        MyClass<String> instance = new MyClass<>();
        instance.field = "Hello";
        instance.ShowField();

        MyClass<Integer> instance2 = new MyClass<>();
        instance2.field = 123;
        instance2.ShowField();
    }
}
