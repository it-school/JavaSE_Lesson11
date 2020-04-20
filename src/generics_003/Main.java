package generics_003;


class Main {
    public static void main(String[] args){
        MyClass.Method(21);
        MyClass.Method(2);
        MyClass.Method(3.213);
        MyClass.Method(23.4f);
        MyClass.Method("123");
        MyClass.Method(((Number) 123.4f).byteValue());
	    MyClass.Method(new generics_001.MyClass());
    }
}
