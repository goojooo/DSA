public class Calculator {
    static int add(int x, int y) {
        int sum = x + y;
        return sum; // send the result back
    }
    public static void main(String[] args) {
        int result = add(5,3);
        System.out.println("Sum is = " + result);
    }
}
