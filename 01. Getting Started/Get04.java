// Sum of natural numbers in a range

import java.util.Scanner;

public class Get04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Staring number: ");
            int n1= sc.nextInt();


            System.out.print("Enter ending number: ");
            int n2= sc.nextInt();

            int sum=((n2*(n2+1))/2)-((n1*(n1-1))/2);

            System.out.println("Sum : "+ sum);
        }
    }
} 
