// Greatest of three numbers

import java.util.Scanner;

public class Get05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int n1= sc.nextInt();

            System.out.print("Enter second number: ");
            int n2= sc.nextInt();

            System.out.print("Enter second number: ");
            int n3= sc.nextInt();

            if(n1>=n2 && n1>=n3) System.out.println("Greatest number: "+ n1);
            else if(n2>=n3 && n2>=n1) System.out.println("Greatest number: "+ n2);
            else if(n3>=n1 && n3>=n2) System.out.println("Greatest number: "+n3);
            
        }
    }
} 
