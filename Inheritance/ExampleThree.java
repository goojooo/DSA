class A{
    void showA(){
        System.out.println("This is class A...");
    }
}
class B extends A{
    void showB(){
        System.out.println("This is class B...");
    }
}

class C extends B{
    void showC(){
        System.out.println("This is class C...");
    }
}
public class ExampleThree {
    public static void main(String [] args) {
        C ref = new C();
        ref.showA();
        ref.showB();
        ref.showC();

    }
}
