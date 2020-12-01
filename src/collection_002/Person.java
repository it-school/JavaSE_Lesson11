package collection_002;


class Person implements Comparable
{
    private final String name;
    private final int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return name + ", " + age;
    }

    @Override
    public int compareTo(Object o)
    {
        if (o == null) { return -1; }
        Person person = (Person) o;
        int res = this.age == person.age && this.name.equals(person.name) ? 0 : -1;
        return res;
    }
}
