class PersonI {
    String name;

    void speak() {
        System.out.println("Hi I'm " + name);
    }
}
public class ObjectDemoII {
    public static void main(String [] args){
        PersonI p1 = new PersonI();
        PersonI p2 = new PersonI();
        p1.name = "Nayan";
        p2.name = "Keshari";

        p1.speak();
        p2.speak();
    }
}
