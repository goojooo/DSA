// Write an algo. to find the sum of all elementtts in the array

import java.util.Scanner;

public class SumArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Main logic
         int sum = 0;
         for(int i = 0 ; i<arr.length ; i++)
         {
            sum = sum + arr[i];
         }
        System.out.println(sum);
                 
        

    }
}