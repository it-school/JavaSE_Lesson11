package generics_002;

class MyClass<TYPE1, TYPE2> {
    private TYPE1 field1;
    private TYPE2 field2;

    MyClass(TYPE1 _field1, TYPE2 _field2) {
        this.field1 = _field1;
        this.field2 = _field2;
    }

    public TYPE1 getField1() {
        return field1;
    }

    public TYPE2 getField2() {
        return field2;
    }

    public void info()
    {
        System.out.println(field1 + " is " + (this.field1 instanceof Number ? "" : "NOT ") + "Number");
        System.out.println(field2 + " is " + (this.field2 instanceof Number ? "" : "NOT ") + "Number");
    }
}
