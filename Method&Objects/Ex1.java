class Dog{
    String name, breed;

    void bark(){
        System.out.println("Dog name is " + name+"bark Woof...!");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Shiro";
        d.bark();
        // System.out.println("Dog name " + d.name + " bark " + d.bark() );
    }
}
