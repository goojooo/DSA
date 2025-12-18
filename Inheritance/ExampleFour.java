class Animals{
    void eat(){
        System.out.println("All animal eats food...");
    }
}

class Dogs extends Animals{
    void bark() {
        System.out.println("Dog bark");
    }
}

class Cats extends Animals{
    void meow(){
        System.out.println("Cat Meow");

    }
}
public class ExampleFour {
    public static void main(String [] args) {
        Cats ref =new Cats();
        ref.eat();
        ref.meow();

        Dogs ref1 = new Dogs();        
        ref1.eat();
        ref1.bark();
    }
}
