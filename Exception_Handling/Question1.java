package Exception_Handling;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num1=sc.nextInt();
            System.out.println("Enter divisor: ");
            int num2=sc.nextInt();
            try{
                double ans=num1/num2;
                System.out.println("Result"+ans);
            }
            catch (ArithmeticException e){
                System.out.println("Exception! Division by zero not possible");
            }
        }
    }
}
