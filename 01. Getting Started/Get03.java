// Sum of first n natural numbers

import java.util.Scanner;

public class Get03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n= sc.nextInt();
            int sum=(n*(n+1))/2;
            System.out.println("Sum : "+ sum);
        }
    }
}
