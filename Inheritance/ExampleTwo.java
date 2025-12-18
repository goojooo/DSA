class Vehical{
    int wheels = 4 ;
}

class Car extends Vehical {
    String color = "Red";
}
public class ExampleTwo {
    public static void main(String [] args) {
        Car myCar = new Car();
        System.out.println("Car has "+ myCar.wheels + " wheels");
        System.out.println("Car color is "+ myCar.color);
    }
}
