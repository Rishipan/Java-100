// Check leap year

import java.util.Scanner;

public class Get06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Year: ");
            int year= sc.nextInt();

            if(year%400==0) System.out.println(year + " is leap year");
            else if(year%4==0 && year%100!=0) System.out.println(year + " is leap year");
            else System.out.println(year + " is not a leap year");
        }
    }
} 
