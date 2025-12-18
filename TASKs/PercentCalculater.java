import java.util.Scanner;

public class PercentCalculater{

    public static void main(String args[]){
        PercentCalculater p1 = new PercentCalculater();
        System.out.println("====Percentage====");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter English score :");
        int a = sc.nextInt();
        System.out.println("Enter Maths score :");
        int b = sc.nextInt();
        System.out.println("Enter Science score :");
        int c = sc.nextInt();
        System.out.println("Enter Physics score :");
        int d = sc.nextInt();
        System.out.println("Enter Chemistry score :");
        int e = sc.nextInt();
        float total = a+b+c+d+e;
        float percent = total/500*100;
        System.out.println("The percentage is : "+ percent);
    }
}