class Person {
    String name;
    int age;

    Person() {
        this("Unknown",0);
    }

    Person(String name , int age ) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
    public static void main(String [] args) {

    }
}

public class PersonDemo {
    public static void main(String [] args) {
        Person p1 = new Person("Nayan",21);
        Person p2 = new Person();
        System.out.println(p1);
        System.out.println(p2);
    }
}
