import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers.");

        System.out.print("\nEnter integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter integer: ");
        int num3 = input.nextInt();

        if((num1 < num2) && (num2 < num3)){
            System.out.println("\nStrictly increasing.");
        } else if((num1 < num2) && (num2 == num3 ) || ((num2 < num3) && (num1 ==num2))){
           System.out.println("\nIncreasing.");
        } else if ((num1 == num2) && (num2 == num3)){
            System.out.println("\nSame.");
        } else if((num1 > num2) && (num2 > num3)){
            System.out.println("\nStrictly decreasing.");
        } else if((num1 > num2) && (num2 == num3 ) || ((num2 > num3) && (num1 ==num2))){
            System.out.println("\nDecreasing");
        } else {
            System.out.println("\nUnordered.");
        }

        input.close();

    }
}
