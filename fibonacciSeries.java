package Assignment2;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("How many fibonacci do you want to print: ");
        int n = number.nextInt();
        int a=0, b=1, Fibonacci;
        System.out.println(a);
        System.out.println(b);
        for (int i=3 ;i<=n ;i++){
            Fibonacci = a + b;
            System.out.println(Fibonacci);
            a = b;
            b = Fibonacci;
        }
    }
}
