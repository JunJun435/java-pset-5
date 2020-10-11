import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        String temp = input.nextLine();

        int index = temp.indexOf(" ");

        double myTemp = Double.parseDouble(temp.substring(0 , index));

        String type = temp.substring((index + 1));
        type = type.toUpperCase();

        switch (type) {
            case ("C"):
                if( myTemp < 0){
                    System.out.println("\nSolid.");
                } else if ((myTemp >= 0) &&(myTemp <= 100)){
                    System.out.println("\nLiquid.");
                } else {
                    System.out.println("\nGas.");
                }
                break;

            case ("F"):
                if (myTemp < 32) {
                    System.out.println("\nSolid.");
                } else if ((myTemp >= 32) &&(myTemp <= 212)){
                    System.out.println("\nLiquid.");
                } else {
                    System.out.println("\nGas.");
                }
                break;

            default :
                System.out.println("\nThat's not a valid scale.");
        }
        input.close();
    }
}
