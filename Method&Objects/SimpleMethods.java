public class SimpleMethods{
    static int add(int a , int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello " +name+ " !...");
    }
    public static void main(String [] args) {
        greet("Nayan");
        int sum = add(5,10);

        System.out.println("5 + 10 = " + sum);

    }
}