import java.util.Scanner;
public class Ex01PosNeg {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter their name
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if(num>0) System.out.println("Number is positive");
            else if(num<0) System.out.println("Number is negative");
            else System.out.println("Number is zero");
        }
    }
}

