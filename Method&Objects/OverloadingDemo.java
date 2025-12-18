public class OverloadingDemo {
    static int area(int side) {
        return side * side;
    }

    static int area(int width , int lenght) {
        return width * lenght;
    }
    static double area(double radius) {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        System.out.println("Square are = " + area(4));
        System.out.println("Reactangle are = " + area(3,5));
        System.out.println("Square are = " + area(2.5));
    }
}
