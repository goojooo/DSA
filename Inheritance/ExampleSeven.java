class Parent{
    int money = 5000;
}

class Child extends Parent{
    int money = 2000;

    void showMoney() {
        System.out.println("Child money : " + money);
        System.out.println("Parent money : " + super.money);
    }
}
public class ExampleSeven {
    public static void main(String[] args) {
        Child c = new Child();
        c.showMoney();
    }
}
