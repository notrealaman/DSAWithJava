package DSA;

import java.util.Scanner;

public class Recursion {

    static int Factorial(int n){
        if(n == 1) return 1;
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s1.nextInt();
        int factorial = Factorial(n);
        System.out.printf("\nFactorial of %d is %d",n,factorial);
        s1.close();
    }
}
