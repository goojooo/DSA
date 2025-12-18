class Animalx{
    void sound(){
        System.out.println("Animals makes a sound...");
    }
}

class Dogss extends Animalx{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class ExampleSix {
    public static void main(String [] args) {
        Dogss d = new Dogss();
        d.sound(); // Dog's version executes
    }
}
