package RecursionQuestions;

import java.util.Scanner;

public class FindPower {
    static int power(int i, int j){
        if(j == 0) return 1;

        return i * power(i, j - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int i = scanner.nextInt();
        System.out.print("Enter Power : ");
        int j = scanner.nextInt();

        System.out.printf("Power of %d^%d = %d",i,j,power(i, j));
        
        scanner.close();

    }
}
