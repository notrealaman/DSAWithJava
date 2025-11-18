package RecursionQuestions;

import java.util.Scanner;

public class SumOfDigits {

    static int sumDigits(int n){
        if(n == 0) return 0;

        return (n%10) + sumDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s1.nextInt();
        System.out.printf("Sum of Digits of %d is %d",n,sumDigits(n));        
        s1.close();
    }
}
