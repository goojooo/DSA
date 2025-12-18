class Person{
    String name;
    int age;

    void speak(){
        System.out.println("Hi my name is - " +name);
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
        Person p1 = new Person(); // create an object
        p1.name = "Nayan";
        p1.age = 23;
        p1.speak(); // call method on object
    }
}
