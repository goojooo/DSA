class Calculatorx {
    int add(int a , int b) {
        return a + b;
    }

    int multiply(int a , int b) {
        return a * b;
    }
}
public class TestCalc {
    public static void main(String [] args) {
        Calculatorx c = new Calculatorx();
        System.out.println("Addition is : " + c.add(5,5));
        System.out.println("Multiplication is : " + c.multiply(5,5));
    }
}
