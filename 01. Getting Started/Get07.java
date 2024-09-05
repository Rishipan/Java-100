// Check prime number

import java.util.Scanner;

public class Get07 {

    static boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n= sc.nextInt();

            if(isPrime(n)) System.out.print(n+" is Prime number");
            else System.out.print(n+" is not a Prime number");

        }
    }
} 
