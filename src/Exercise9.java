import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = input.nextLine();
        month = month.toUpperCase();
        month = month.substring (0 , 3);

        if (month.equals("FEB")){
            System.out.println("\n28 or 29 days.");
        } else if (month.equals("APR") || month.equals("JUN") || month.equals("SEP") || month.equals("NOV")){
            System.out.println("\n30 days.");
        } else if (month.equals("JAN") ||month.equals("MAR") || month.equals("MAY") || month.equals("JUL") || month.equals("AUG") || month.equals("OCT") || month.equals("DEC") ){
            System.out.println("\n31 Days.");
        } else {
            System.out.println("\nThat's not a valid month.");
        }
        input.close();
    }
}
